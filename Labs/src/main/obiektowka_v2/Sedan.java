package main.obiektowka_v2;

public class Sedan extends Osobowy {

    private String model;
    private String symbol;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Sedan(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, iloscOsob);
        this.model = model;
        this.symbol = symbol;
    }

    public Sedan(String rozmiarOpony, int iloscOsob, String model, String symbol) {
        super(rozmiarOpony, iloscOsob);
        this.model = model;
        this.symbol = symbol;
    }

    public Sedan(int iloscOsob, String model, String symbol) {
        super(iloscOsob);
        this.model = model;
        this.symbol = symbol;
    }
}
