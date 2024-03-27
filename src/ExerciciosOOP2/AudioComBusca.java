package ExerciciosOOP2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class AudioComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um disco para busca: ");
        var busca = leitura.nextLine();

        String endereco = "https://theaudiodb.p.rapidapi.com/search.php?s=coldplay";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .header("X-RapidAPI-Key", "ccec3dfaddmshf157eda51da7eefp105eddjsndd7744955fbb")
              //  .header("X-RapidAPI-Host", "theaudiodb.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
