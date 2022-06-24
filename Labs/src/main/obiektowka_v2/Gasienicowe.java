package main.obiektowka_v2;

public class Gasienicowe extends Pojazd {

    private int moc;

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public Gasienicowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa, int moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.moc = moc;
    }

    public Gasienicowe(int moc) {
        this.moc = moc;
    }

    // Zad. 12. Po dodawaniu słowa 'final' do metody nie
    // możemy przesłaniać tą metodę w klasie podrzędnej

    // Zad. 14. Nie możemy dodać modyfikatora dostępu 'protected'
    // do tej metody, bo w klasie bazowej ta metoda zdefiniowana jako 'public'
    // i w tym przypadku modyfikator 'protected' ogranicza dostęp do tej metody
    // dla wszystkich klas bazowych, w przypadku, gdy będzie potrzebne traktować
    // ten obiekt jako obiekt klasy bazowej (czyli nastąpi naruszenie polimorfizmu)
    // + to w ogóle nie da się skompilować
    @Override
    public final void uruchomSilnik() {
        super.uruchomSilnik();
        System.out.println("Jest to pojazd gąsienicowy");
    }
}
