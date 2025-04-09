import java.io.Serializable;

public class Silnik extends ObjectPlus implements Serializable {
    private double pojemnosc;
    private int iloscKoniMechaniczynch;
    private String rodzajPaliwa;
    String arr[]={"benzyna","diesel","hybrydowy","elektryczny"};

    public Silnik(double pojemnosc, int iloscKoniMechaniczynch, String rodzajPaliwa) {
       super();
        if(rodzajPaliwa.isBlank() || rodzajPaliwa==null){
            throw new IllegalArgumentException("Silnik musi cos spalac");
        }
        boolean znajde=false;
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals(rodzajPaliwa.toLowerCase())){
                znajde=true;
            }
        }
        if(znajde==false){
            throw new IllegalArgumentException("Nie ma takiego rodzaju paliwa");
        }
        this.pojemnosc = pojemnosc;
        this.iloscKoniMechaniczynch=iloscKoniMechaniczynch;
        this.rodzajPaliwa=rodzajPaliwa;




    }
    public double getPojemnosc() {
        return pojemnosc;
    }
    public int getIloscKoniMechaniczynch() {
        return iloscKoniMechaniczynch;
    }
    public String rodzajPaliwa() {
        return rodzajPaliwa;
    }
    public void setIloscKoniMechaniczynch(int iloscKoniMechaniczynch) {
        this.iloscKoniMechaniczynch=iloscKoniMechaniczynch;
    }


}
