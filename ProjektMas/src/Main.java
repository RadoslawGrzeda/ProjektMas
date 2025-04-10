import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // Wczytanie ekstensji
//        try {
//            File file = new File("ekstensje.dat");
//            if (file.exists()) {
//                try (ObjectInputStream obI = new ObjectInputStream(new FileInputStream(file))) {
//                    ObjectPlus.readExtents(obI);
//                    System.out.println("Ekstensje wczytane.");
//                }
//            } else {
//                System.out.println("Brak pliku.");
//            }
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println("Błąd podczas wczytywania: " + e.getMessage());
//        }

        //1
//        Silnik silnik = new Silnik(1.6, 132, "Benzyna");
//        Samochod sam = new Samochod("Toyota", "Auris", 2009, silnik, "nic ciekawego", "radio");
//        System.out.println(Samochod.getEkstensjaSamochod());


        //3
//         Silnik silnik = new Silnik(1.6, 132, "Benzyna");
//        System.out.println(sam.getSilnik().getIloscKoniMechaniczynch());
//        Samochod sam = new Samochod("Toyota", "Auris", 2009, silnik, "nic ciekawego", "radio");

        //4
//        Silnik silnik = new Silnik(1.6, 132, "Benzyna");
//        Samochod sam = new Samochod("Toyota", "Auris", 2009, silnik,  "radio");
//        String opis="Niezawodny samochod, swietnie sprawujacy sie w miescie";
//        Samochod sam2 = new Samochod("Toyota", "Auris", 2009, silnik, opis, "radio");
//        System.out.println(sam.getOpis());
//        System.out.println(sam2.getOpis());
//        sam.setOpis(opis);
//        System.out.println(sam.getOpis());

        //5
//        Silnik silnik = new Silnik(1.6, 132, "Benzyna");
//        Samochod sam = new Samochod("Toyota", "Auris", 2009, silnik,  "radio");
//        sam.setMarka("");
//        sam.setMarka(null);


        //6
//        Silnik silnik = new Silnik(1.6, 132, "Benzyna");
//        Samochod sam = new Samochod("Toyota", "Auris", 2009, silnik,  "radio");
//        System.out.println(sam.getElementWyposazenia());
//        sam.dodajElementWyposazenia(null);
//        sam.dodajElementWyposazenia("");
//        sam.dodajElementWyposazenia("klimatyzacja");
//        System.out.println(sam.getElementWyposazenia());
//        sam.usunElementWyposazenia("isofix");
//        sam.usunElementWyposazenia("klimatyzacja");
//        System.out.println(sam.getElementWyposazenia());
//        sam.usunElementWyposazenia("radio");
//

        //7
//        Silnik silnik = new Silnik(1.6, 132, "Benzyna");
//        Samochod sam = new Samochod("Toyota", "Auris", 2009, silnik,  "radio");
//        System.out.println(sam.getKaucja());
//        sam.setKaucja(3212);
//        System.out.println(sam.getKaucja());
//        sam.setKaucja(1700);
//        System.out.println(sam.getKaucja());

        //8
        Silnik silnik = new Silnik(1.6, 132, "Benzyna");
        Samochod sam = new Samochod("Toyota", "Auris", 2009, silnik,  "radio");
        System.out.println(sam.getWiekSamochodu());


//        try (ObjectOutputStream obp = new ObjectOutputStream(new FileOutputStream("ekstensje.dat"))) {
//            ObjectPlus.writeExtents(obp);  // Zapis obiektów do pliku
//            System.out.println("Elementy zapisane.");
//        } catch (IOException e) {
//            System.out.println("Błąd podczas zapisywania do ekstensji: " + e.getMessage());
//        }

    }
}