package consumindo.api.google.books;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        //https://www.googleapis.com/books/v1/volumes?q=livro
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o livro que deseja pesquisar: ");
        String titulo = scanner.next();
        String url = String.format("https://www.googleapis.com/books/v1/volumes?q=%s", titulo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
