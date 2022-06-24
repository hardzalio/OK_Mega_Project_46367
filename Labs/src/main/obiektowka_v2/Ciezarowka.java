package main.obiektowka_v2;

public class Ciezarowka extends Kolowe {
    private int udzwig;

    public void podniesSkrzynie() {

    }

    public int getUdzwig() {
        return udzwig;
    }

    public void setUdzwig(int udzwig) {
        this.udzwig = udzwig;
    }

    public Ciezarowka(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int udzwig) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.udzwig = udzwig;
    }

    public Ciezarowka(String rozmiarOpony, int udzwig) {
        super(rozmiarOpony);
        this.udzwig = udzwig;
    }

    public Ciezarowka(int udzwig) {
        this.udzwig = udzwig;
    }
}
