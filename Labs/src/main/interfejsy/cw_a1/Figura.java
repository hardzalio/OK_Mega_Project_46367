package main.interfejsy.cw_a1;

public class Figura implements Rysowanie {

    @Override
    public void rysuj2D() {
        System.out.println("Rysowanie 2D");
    }

    @Override
    public void rysuj3D() {
        System.out.println("Rysowanie 3D");
    }
}
