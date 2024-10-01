package trycatch.githubapi;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Digite o username do usuário que deseja pesquisar:");
            String usuario = scanner.nextLine();
            String url = String.format("https://api.github.com/users/%s", usuario);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            UserRecord findUser = gson.fromJson(response.body(), UserRecord.class);
            User myUser = new User(findUser);
            System.out.println(myUser);

        }catch(ErroConsultaGithubException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
