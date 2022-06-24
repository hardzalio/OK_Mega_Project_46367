package main;

import main.obiektowka_v1_lombok.MineralWater;
import main.obiektowka_v1_lombok.MineralWaterLombok;
import main.pliki_operacje_tekst.NetworkPageTextSelector;
import main.pliki_operacje_tekst.Dane1Reader;
import main.pliki_operacje_tekst.Dane2Reader;
import main.pliki_operacje_tekst.NapisReader;
import main.pliki_operacje_tekst.BigIntegerExample;
import main.obiektowka_v2.Golf;

public class Main {
    public static void main(String[] args) {
        /* ********* Obiektowka1 ******** */
        MineralWater mineralWater = new MineralWater("Mirinda", 20);
        MineralWaterLombok mineralWaterLombok = new MineralWaterLombok("Sprite", 10);

        System.out.println("Non lombok output: ");
        System.out.println(mineralWater.getName());
        System.out.println(mineralWater.getPrice());

        System.out.println("Lombok output: ");
        System.out.println(mineralWaterLombok.getName());
        System.out.println(mineralWaterLombok.getPrice());

        /* ********* Pliki operacje na tek?cie ******** */
        // Zad 1, 2.
        System.out.println("Dane 1: ");
        Dane1Reader dane1Reader = new Dane1Reader("src/main/pliki_operacje_tekst/dane1.txt");
        dane1Reader.read();
        System.out.printf("Suma liczb: %d\n", dane1Reader.sum());

        // Zad 3.
        System.out.println("Dane 2: ");
        Dane2Reader dane2Reader = new Dane2Reader("src/main/pliki_operacje_tekst/dane2.txt");
        dane2Reader.read();

        // Zad 4.
        System.out.println("Napis: ");
        NapisReader napisReader= new NapisReader("src/main/pliki_operacje_tekst/napis.txt");
        napisReader.read();

        NetworkPageTextSelector networkPageTextSelector = new NetworkPageTextSelector();
        // Zad 5.
        System.out.println("Linii z @: ");
        networkPageTextSelector.printLinesWithAtSigns("https://www.dsw.edu.pl/kontakt");
        // Zad 6.
        System.out.println("Linii z @ bez @media: ");
        networkPageTextSelector.printLinesWithAtSignsExceptAtMedia("https://www.dsw.edu.pl/kontakt");
        // Zad 7.
        System.out.println("Email'y: ");
        networkPageTextSelector.printAllEmails("https://www.dsw.edu.pl/kontakt");

        // Zad 8.
        try {
            System.out.println("Przyklad z wyjatkiem w BigInteger: ");
            BigIntegerExample bigIntegerExample = new BigIntegerExample();
            bigIntegerExample.operationThatThrowsException();
        } catch (ArithmeticException ex) {
            System.err.println("BigInteger overflow!!!");
        }

        /* ********* Obiektowka2 ******** */
        // Zad. 8.
        Golf golf1 = new Golf(2019, "elektryczny", "bialy", 1200, "195/70 R15", 4);
        Golf golf2 = new Golf(2012, "benzynowy", "czerwony", 1500, "185/70 R16", 5);
        Golf golf3 = new Golf(2009, "diesel", "niebieski", 1800, "195/80 R17,", 5);
    }
}
