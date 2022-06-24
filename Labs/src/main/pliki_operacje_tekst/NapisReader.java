package main.pliki_operacje_tekst;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NapisReader {
    private final String filePath;
    public NapisReader(String filePath) {
        this.filePath = filePath;
    }

    public void read() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            long skipped = bufferedReader.skip(15464);
            System.out.printf("Skipped %d symbols\n", skipped);
            bufferedReader.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
