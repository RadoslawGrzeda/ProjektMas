public class Main {
    public static void main(String[] args) {

    Silnik silnik=new Silnik(1.6,132,"Beznyzna");

    Samochod sam=new Samochod(silnik,"Toyota","verso",1,"2022",5,192.31,100,600,2300,null);
    Samochod sam2=new Samochod(silnik,"Toyota","verso",1,"2022",5,192.31,100,600,2300,true);

//    Samochod.show();
        System.out.println(sam.isofix());
        System.out.println(sam2.isofix());
//        System.out.println(Samochod.getSamochod());
    }
}