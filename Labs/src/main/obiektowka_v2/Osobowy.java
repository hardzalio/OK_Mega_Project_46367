package main.obiektowka_v2;

public class Osobowy extends Kolowe{

    public int iloscOsob;

    public int getIloscOsob() {
        return iloscOsob;
    }

    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }

    public Osobowy(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.iloscOsob = iloscOsob;
    }

    public Osobowy(String rozmiarOpony, int iloscOsob) {
        super(rozmiarOpony);
        this.iloscOsob = iloscOsob;
    }

    public Osobowy(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }
}
