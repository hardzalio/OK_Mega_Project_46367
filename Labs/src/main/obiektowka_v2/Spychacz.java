package main.obiektowka_v2;

public class Spychacz extends Gasienicowe {
    public Spychacz(int rokProdukcji, String rodzajSilnika, String kolor, double masa, int moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, moc);
    }

    public Spychacz(int moc) {
        super(moc);
    }
}
