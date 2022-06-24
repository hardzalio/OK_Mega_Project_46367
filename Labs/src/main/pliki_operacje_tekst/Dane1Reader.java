package main.pliki_operacje_tekst;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Dane1Reader {

    private final String filePath;

    public Dane1Reader(String filePath) {
        this.filePath = filePath;
    }

    public void read() {
        try {
            File file = new File(filePath);
            List<String> lines = Files.readAllLines(file.toPath());
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int sum() {
        int sum = 0;
        try {
            File file = new File(filePath);
            List<String> lines = Files.readAllLines(file.toPath());
            for (String line: lines) {
                String[] numsAsStrings = line.split(" ");
                for (String numsAsString : numsAsStrings) {
                    sum += Integer.parseInt(numsAsString);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException ex) {
            System.out.println("Error! This piece of string is not a number!");
        }
        return sum;
    }
}
