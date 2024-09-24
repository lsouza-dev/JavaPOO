package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Filme para buscar na Omdb API: ");
        String filme = scanner.nextLine();
        String url = String.format("http://www.omdbapi.com/?t=%s&apikey=97a578a4", filme);
        // Criando um cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        // Fazendo minha requisição através do builder
        HttpRequest request = HttpRequest.newBuilder()
                // Criando o caminho da requisição
                .uri(URI.create(url))
                //Construindo a requisição
                .build();
        // Criando a resposta e retornando uma string
        // Passando como parâmetro a requisição e o corpo
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
