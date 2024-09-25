package record.livro;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        String url = String.format("https://www.googleapis.com/books/v1/volumes?q=%s", titulo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new Gson();
        LivroRecord record = gson.fromJson(json,LivroRecord.class);
        Livro livro = new Livro(record);
        System.out.println(record);
        */

        String json = """
                {
                    "Titulo":"Avatar",
                    "Autor":"Joãozinho",
                    "Editora":"Minha Editora"
                }
                """;
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        LivroRecord record = gson.fromJson(json, LivroRecord.class);
        Livro livro = new Livro(record);
        System.out.println(livro);
    }
}
