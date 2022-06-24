package main.obiektowka_v2;

// Zad. 13. Zwykła klasa nie może posiadać
// modyfikatora dostępu 'private'

// Zad. 15. W prypadku, gdy nie wpiszemy żadnego modyfikatora dostępu
// domyślnie działa modyfikator dostępu 'package-default',
// co oznacza, że ta klasa będzie widoczna wyłacznie dla tych klas,
// które znajdują się w tym samym pakiecie

// Zad. 16. Wyjaśnienie analogiczne do Zad. 15.
public class Pojazd {
    private int rokProdukcji;
    private String rodzajSilnika;
    private String kolor;
    private double masa;

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public Pojazd(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
    }

    public Pojazd() {
        this(0, "", "", 0.0);
    }

    public void uruchomSilnik() {
        System.out.println("Silnik uruchomiono");
    }
}
