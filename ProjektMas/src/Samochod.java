import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Samochod extends ObjectPlus{
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
    private Silnik silnik; //zlozony
    private String opis; //opcjonalny
    private String marka;//wymagany
    private List<String> elementyWyposazenia=new ArrayList<>(); //powtarzalny
    private static double kaucja=5000;
    private int rokProdukcji;
    private String model;


//    Silnik silnik = new Silnik(1.6, 132, "Benzyna");
    Silnik silk= new Silnik(1.6, 132, "Benzyna");
    public Samochod(String marka,String model,int rokProdukcji,Silnik silnik,String elementWyposazenia) {
        super();
        if(marka.isBlank() || marka==null){
            throw new IllegalArgumentException("Marka nie moze byc pusta");
        }
        if (silnik == null) {
            throw new IllegalArgumentException("Silnik nie może być pusty");
        }
        this.silnik = silnik;

        this.rokProdukcji=rokProdukcji;
        this.model=model;
        dodajElementWyposazenia(elementWyposazenia);
        this.marka=marka;
        this.opis = null;
        ekstensjaSamochod.add(this);
        }

    public Samochod(String marka,String model,int rokProdukcji,Silnik silnik, String opis,String elementWyposazenia) {
        super();
        if(marka.isBlank() || marka==null){
            throw new IllegalArgumentException("Marka nie moze byc pusta");
        }
        if (silnik == null) {
            throw new IllegalArgumentException("Silnik nie może być pusty");
        }
        if (opis.isBlank() || opis.length()>100 || opis.length()< 20) {
            throw new IllegalArgumentException("Niepoprawnie skonstruowany opis");
        }


        this.silnik = silnik;
        this.rokProdukcji=rokProdukcji;
        this.model=model;
        dodajElementWyposazenia(elementWyposazenia);
        this.marka=marka;
        this.opis = opis;
        ekstensjaSamochod.add(this);
    }

    //1
    public static List<Samochod> getEkstensjaSamochod()
    {
        return Collections.unmodifiableList(ekstensjaSamochod);
    }


    //2


    //3

    //4
    public void setOpis(String opis) {
        if(opis==null) {
            this.opis = null;
            return;
        }
        if (opis.length() < 30 ||  opis.length() >= 100) {
            throw new IllegalArgumentException();
        }
        this.opis = opis;
    }

    public String getOpis(){
        return opis;
    }

    //5

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if(marka==null || marka.isBlank()){
            throw new IllegalArgumentException("Marka nie moze byc pusta");
        }
        this.marka = marka;

    }


    //6
    public  void dodajElementWyposazenia(String elementWyposazenia){
        if(elementWyposazenia.isBlank())
            throw new IllegalArgumentException("ElementWyposazenia nie moze byc pusty");
        if(elementWyposazenia==null)
            throw new IllegalArgumentException("Element musi posiadac jakas wartosc");

        this.elementyWyposazenia.add(elementWyposazenia);
    }

    public  void usunElementWyposazenia(String elementWyposazenia){
        if (!this.elementyWyposazenia.contains(elementWyposazenia)) {
            throw new IllegalArgumentException("Samochod nie posiada takiego wyposażenia");
        }if(elementyWyposazenia.size()==1) {
                throw new IllegalArgumentException("Nie mozna usunac osattniego elementu wyposazenia");
            }
                this.elementyWyposazenia.remove(elementWyposazenia);
            }


    //7
    public static double getKaucja(){
        return kaucja;
    }
    public static void setKaucja(double nowaKaucja){
        if (nowaKaucja<2000){
            throw new IllegalArgumentException("Za niska cena kaucji");
        }
        kaucja = nowaKaucja;
    }


    //8
    public int getWiekSamochodu(){
        int aktualnyRok=java.time.Year.now().getValue();
        return aktualnyRok-rokProdukcji;
    }





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
}
public Silnik getSilnik(){
        return silnik;
}

}

