public class Main {
    public static void main(String[] args) {

    Silnik silnik=new Silnik(1.6,132,"Beznyzna");

//    Samochod sam=new Samochod(silnik,"Toyota","verso",1,"2022",5,192.31,100,600,2300,null);
//    Samochod sam2=new Samochod(silnik,"Toyota","verso",1,"2022",5,192.31,100,600,2300,true);

      Samochod sa=new Samochod("opel",silnik,"Radio");
      Samochod sa2=new Samochod("Ford",new Silnik(3.2,215,"dise"),"testttt");

      sa


      sa.setOpis(null);
      //      sa.setOpis("");
System.out.println(sa.getOpis());


//    Samochod.show();
//        System.out.println(sam.isofix());
//        System.out.println(sam2.isofix());
//        System.out.println(Samochod.getSamochod());
    }
}