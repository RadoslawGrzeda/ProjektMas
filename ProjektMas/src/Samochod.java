import java.util.ArrayList;
import java.util.Optional;


public class Samochod {
    private String marka;
    private String model;
    private int idSamochodu;
    private String dataProdukcji;
    private int liczbaMiejsc;
    private double aktualnyPrzebieg;
    private Silnik silnik;
    private boolean isofix;

    //stan
    private double kwotaWypozyczeniaZaDzien;
    private double kwotaWypozyczeniaZaMiesiac;
    private double kwotaWypozyczeniaZatydzien;
    private static ArrayList<Samochod>ektensjaSamochod=new ArrayList<>();
    //Konstruktor
    public Samochod
         (Silnik silnik,
          String marka,String model,int idSamochodu, String dataProdukcji,
          int liczbaMiejsc,double aktualnyPrzebieg,double kwotaWypozyczeniaZaDzien,
          double kwotaWypozyczeniaZatydzien,double kwotaWypozyczeniaZaMiesiac,Boolean isofix
         )
    {
        this.isofix=(isofix==null) ? false : isofix;
        this.marka=marka;
        this.model=model;
        this.idSamochodu = idSamochodu;
        this.dataProdukcji = dataProdukcji;
        this.liczbaMiejsc = liczbaMiejsc;
        this.aktualnyPrzebieg = aktualnyPrzebieg;
        this.kwotaWypozyczeniaZaDzien = kwotaWypozyczeniaZaDzien;
        this.kwotaWypozyczeniaZatydzien=kwotaWypozyczeniaZatydzien;
        this.kwotaWypozyczeniaZaMiesiac = kwotaWypozyczeniaZaMiesiac;
        ektensjaSamochod.add(this);

        }
/

    public static void show(){
        for(Samochod samochod : ektensjaSamochod){
            System.out.print(samochod);
        }
    }
    public static ArrayList<Samochod> getSamochod(){
        return new ArrayList<>(ektensjaSamochod);
    }

    public String toString() {
        return marka+' ' +model+' '+idSamochodu+' ' +dataProdukcji;
        }

        public boolean isofix() {
return isofix;
        }
}
