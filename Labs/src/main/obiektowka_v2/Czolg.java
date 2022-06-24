package main.obiektowka_v2;

public class Czolg extends Gasienicowe {

    public Czolg(int rokProdukcji, String rodzajSilnika, String kolor, double masa, int moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, moc);
    }

    public Czolg(int moc) {
        super(moc);
    }
}
