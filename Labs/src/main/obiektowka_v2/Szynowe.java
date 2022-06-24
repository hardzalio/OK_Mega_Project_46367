package main.obiektowka_v2;

public class Szynowe extends Pojazd {

    public Szynowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    public Szynowe() {
    }

    @Override
    public void uruchomSilnik() {
        System.out.println("Uruchomiono silnik pojazdu szynowego");
    }
}
