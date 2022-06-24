package main.obiektowka_v2;

public class Pickup extends Osobowy {
    public Pickup(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, iloscOsob);
    }

    public Pickup(String rozmiarOpony, int iloscOsob) {
        super(rozmiarOpony, iloscOsob);
    }

    public Pickup(int iloscOsob) {
        super(iloscOsob);
    }
}
