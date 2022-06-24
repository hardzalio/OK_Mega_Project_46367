package main.obiektowka_v2;

public class SuperB extends Skoda {
    public SuperB(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, iloscOsob, model, symbol);
    }

    public SuperB(String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rozmiarOpony, iloscOsob, model, symbol);
    }

    public SuperB(int iloscOsob, String model, String symbol) {
        super(iloscOsob, model, symbol);
    }
}
