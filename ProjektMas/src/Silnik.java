public class Silnik {
    private double pojemnosc;
    private int iloscKoniMechaniczynch;
    private String coSpala;

    public Silnik(double pojemnosc, int iloscKoniMechaniczynch, String coSpala) {
        this.pojemnosc = pojemnosc;
        this.iloscKoniMechaniczynch=iloscKoniMechaniczynch;
        this.coSpala=coSpala;

    }
    //dodaca punkt 2 serializacje
    public double getPojemnosc() {
        return pojemnosc;
    }
    public int getIloscKoniMechaniczynch() {
        return iloscKoniMechaniczynch;

    }
    public String coSpala() {
        return coSpala;
    }


}
