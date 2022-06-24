package main.obiektowka_v2;

public class Kolowe extends Pojazd {

    private String rozmiarOpony;

    public String getRozmiarOpony() {
        return rozmiarOpony;
    }

    public void setRozmiarOpony(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }

    public Kolowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.rozmiarOpony = rozmiarOpony;
    }

    public Kolowe(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }

    public Kolowe() {
        this(0, "", "", 0.0, "");
    }

    public void uruchomSilnik(String rodzajSilnika) {
        System.out.println("Uruchomiono silnik " + rodzajSilnika);
    }
}
