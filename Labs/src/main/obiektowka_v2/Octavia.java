package main.obiektowka_v2;

// Po dodawaniu słowa 'final' do klasy nie można dziedziczyć po tej klasie.
public final class Octavia extends Skoda {
    public Octavia(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, iloscOsob, model, symbol);
    }

    public Octavia(String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rozmiarOpony, iloscOsob, model, symbol);
    }

    public Octavia(int iloscOsob, String model, String symbol) {
        super(iloscOsob, model, symbol);
    }
}
