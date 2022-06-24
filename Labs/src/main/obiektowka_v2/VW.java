package main.obiektowka_v2;

public class VW extends Sedan {
    public VW(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, iloscOsob, model, symbol);
    }

    public VW(String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rozmiarOpony, iloscOsob, model, symbol);
    }

    public VW(int iloscOsob, String model, String symbol) {
        super(iloscOsob, model, symbol);
    }
}
