package main.obiektowka_v2;

public class Skoda extends Sedan {
    public Skoda(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, iloscOsob, model, symbol);
    }

    public Skoda(String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rozmiarOpony, iloscOsob, model, symbol);
    }

    public Skoda(int iloscOsob, String model, String symbol) {
        super(iloscOsob, model, symbol);
    }
}
