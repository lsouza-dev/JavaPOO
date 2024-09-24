package consumindo.api.themeal.recipes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        //https://www.themealdb.com/api/json/v1/1/search.php?s=
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a receita que deseja pesquisar: ");
        String receita = scanner.nextLine();
        String url  = String.format("https://www.themealdb.com/api/json/v1/1/search.php?s=%s", receita);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
