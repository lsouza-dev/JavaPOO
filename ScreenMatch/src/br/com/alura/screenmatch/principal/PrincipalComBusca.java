package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        //Criando um gson com configurações de primeira letra maíuscula
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!busca.equalsIgnoreCase("sair")){
            System.out.println("Filme para buscar na Omdb API: ");
            busca = scanner.nextLine();
            if(busca.equalsIgnoreCase("sair")) break;

            String url = String.format("http://www.omdbapi.com/?t=%s&apikey=97a578a4", busca.replace(" ","+"));
            try{
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
                String json = response.body();

                // Criando um tituloOmdb recebendo o json e transformando em uma classe
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                // Criando um Titulo através do TituloOmdb
                //try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                titulos.add(meuTitulo);

            }catch(NumberFormatException ex){
                System.out.println("Aconteceu um ERRO!");
                System.out.println(ex.getMessage());
            }catch(IllegalArgumentException ex){
                System.out.println("Algum erro de argumento na busca, verifique o endereço.");
            }catch(ErroDeConversaoDeAnoException ex){
                System.out.println(ex.getMessage());
            }catch(Exception ex){
                System.out.println("Aconteceu algo, não sei o que");
            }
        }
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("Program has ended.");
    }
}
