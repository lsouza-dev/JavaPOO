package whriter.titulo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Title:");
            String title = scanner.nextLine();
            System.out.println("Publisher:");
            String publisher = scanner.nextLine();
            System.out.println("Year:");
            int year = scanner.nextInt();
            System.out.println("Runtime:");
            int runtime = scanner.nextInt();

            Titulo meuTitulo = new Titulo.TituloBuilder()
                    .title(title)
                    .publisher(publisher)
                    .year(year)
                    .runtime(runtime)
                    .Build();


            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(meuTitulo);
            System.out.println(json);

        }catch(InputMismatchException ex){
            System.out.println("Insira os dados corretos para a criação do filme.");
        }
    }
}
