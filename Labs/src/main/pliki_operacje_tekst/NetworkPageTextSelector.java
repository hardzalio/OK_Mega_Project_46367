package main.pliki_operacje_tekst;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetworkPageTextSelector {

    private final HttpClient client;

    public NetworkPageTextSelector() {
        this.client = HttpClient.newHttpClient();
    }

    // Napisz program, który ze strony internetowej
    // o wskazanym adresie wyświetla tylko te linie, które zawierają znak “@”.
    public void printLinesWithAtSigns(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            response.body().lines().filter(e -> e.contains("@")).forEach(System.out::println);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Napisz program, który ze strony internetowej
    // o wskazanym adresie, wyświetla tylko te linie,
    // które zawierają znak “@”, pod warunkiem że nie występują w @media
    public void printLinesWithAtSignsExceptAtMedia(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            response.body().lines()
                    .filter(e -> e.contains("@"))
                    .filter(e -> !e.contains("@media"))
                    .forEach(System.out::println);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Napisz program, który ze strony internetowej
    // o wskazanym adresie, wyszuka i wypisze adresy e-mail
    public void printAllEmails(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        Pattern email = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            response.body().lines().forEach(line -> {
                Matcher matcher = email.matcher(line);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            });
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
