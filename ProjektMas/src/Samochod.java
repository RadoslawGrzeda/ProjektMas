import java.util.ArrayList;
import java.util.List;


public class Samochod {
//    private String model;
//    private int idSamochodu;
//    private String dataProdukcji;
//    private int liczbaMiejsc;
//    private double aktualnyPrzebieg;
    //stan
//    private double kwotaWypozyczeniaZaDzien;
//    private double kwotaWypozyczeniaZaMiesiac;
//    private double kwotaWypozyczeniaZatydzien;

    private static ArrayList<Samochod> ekstensjaSamochod = new ArrayList<>(); //ekstensja
    private Silnik silnik;
    private String opis; //opcjonalny
    private String marka;
    private List<String> elementyWyposazenia=new ArrayList<>(); //powtarzalny
    private static double kaucja=5000;
    private int rokProdukcji;
    private String model;


    public Samochod(String marka,String model,int rokProdukcji,Silnik silnik,String elementWyposazenia) {
        if(marka.isBlank() || marka==null){
            throw new IllegalArgumentException("Marka nie moze byc pusta");
        }
        this.rokProdukcji=rokProdukcji;
        this.model=model;
        add(elementWyposazenia);
        this.marka=marka;
        this.silnik = silnik;
        this.opis = null;
        ekstensjaSamochod.add(this);
    }

    public Samochod(String marka,String model,Silnik silnik,int rokProdukcji, String opis,String elementWyposazenia) {
        if(marka.isBlank() || marka==null){
            throw new IllegalArgumentException("Marka nie moze byc pusta");
        }
        this.rokProdukcji=rokProdukcji;
        this.model=model;
        add(elementWyposazenia);
        this.silnik = silnik;
        this.marka=marka;
        this.opis = opis;
        ekstensjaSamochod.add(this);
    }

    //1 Ekstensja
    public static ArrayList<Samochod> getEkstensjaSamochod() {
        return new ArrayList<>(ekstensjaSamochod);
    }


    //2

    //3 klasa Silnik


    //4
    public void setOpis(String opis) {
        if(opis==null) {
            this.opis = null;
            return;
        }
        if (opis.length() < 30)
            throw new IllegalArgumentException();
        this.opis = opis;
    }


    public  void add(String elementWyposazenia){
        if(elementWyposazenia.isBlank())
            throw new IllegalArgumentException("ElementWyposazenia nie moze byc pusty");
        if(elementWyposazenia==null)
            throw new IllegalArgumentException("Element musi posiadac jakas wartosc");

        this.elementyWyposazenia.add(elementWyposazenia);
    }

    public  void remove(String elementWyposazenia){
        if (!this.elementyWyposazenia.contains(elementWyposazenia)) {
            throw new IllegalArgumentException("Samochod nie posiada takiego wyposażenia");
        }if(elementyWyposazenia.size()==1) {
                throw new IllegalArgumentException("Nie mozna usunac osattniego elementu wyposazenia");
            }
                this.elementyWyposazenia.remove(elementWyposazenia);
            }
//            public int getRokProdukcji(){
//        return rokProdukcji;

//            }

    public int getWiekSamochodu(){
        int aktualnyRok=java.time.Year.now().getValue();
        return aktualnyRok-rokProdukcji;
    }


     public String getOpis(){
         return opis;
    }
    public void setMarka(String marka) {
        if(marka==null || marka.isBlank()){
            throw new IllegalArgumentException("Marka nie moze byc pusta");
        }
        this.marka = marka;

    }

public static double getKaucja(){
        return kaucja;
}
    public static void setKaucja(double nowaKaucja){
        if (nowaKaucja<2000){
            throw new IllegalArgumentException("Za niska cena kaucji");
        }
        kaucja = nowaKaucja;
    }

//         (Silnik silnik,
//          String marka,String model,int idSamochodu, String dataProdukcji,
//          int liczbaMiejsc,double aktualnyPrzebieg,double kwotaWypozyczeniaZaDzien,
//          double kwotaWypozyczeniaZatydzien,double kwotaWypozyczeniaZaMiesiac,Boolean isofi)
//    {
//        this.marka=marka;
//        this.model=model;
//        this.idSamochodu = idSamochodu;
//        this.dataProdukcji = dataProdukcji;
//        this.liczbaMiejsc = liczbaMiejsc;
//        this.aktualnyPrzebieg = aktualnyPrzebieg;
//        this.kwotaWypozyczeniaZaDzien = kwotaWypozyczeniaZaDzien;
//        this.kwotaWypozyczeniaZatydzien=kwotaWypozyczeniaZatydzien;
//        this.kwotaWypozyczeniaZaMiesiac = kwotaWypozyczeniaZaMiesiac;
//        ektensjaSamochod.add(this);
//        }


    public static void show() {
        for (Samochod samochod : ekstensjaSamochod) {
            System.out.print(samochod);
        }
    }
    public ArrayList<String> getElementWyposazenia() {return new ArrayList<>(elementyWyposazenia);}


    public static void pokazSamochody(){
        for (Samochod samochod : ekstensjaSamochod) {
            System.out.println(samochod);
        }
    }

@Override
public String toString() {
    return "Samochód: " + marka + " " + model + ", Rok: " + rokProdukcji +
            ", Wiek: " + getWiekSamochodu() + " lat" +
            (opis != null ? ", Opis: " + opis : "") +
            ", Wyposażenie: " + elementyWyposazenia;
}}

//    public String toString() {
//        return marka+' ' +model+' '+idSamochodu+' ' +dataProdukcji;
//        }
//
//        public boolean isofix() {
//return isofix;
//        }
//}
