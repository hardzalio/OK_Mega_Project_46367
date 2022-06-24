package main.pliki_operacje_tekst;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Dane2Reader {

    private final String filePath;

    public Dane2Reader(String filePath) {
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

}
