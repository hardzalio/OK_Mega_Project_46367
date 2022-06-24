package main.interfejsy.cw_b3;

public class Telewizor implements WyswietlaObrazIWydajeDzwiek {

    @Override
    public void graj() {
        System.out.println("Gra...");
        //instrukcje metody graj
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyświetla...");
        //instrukcje metody wyswietl
    }
}

