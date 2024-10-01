package principal;

import api.Api;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import endereco.Endereco;
import endereco.EnderecoRecord;
import exceptions.EnderecoNuloEncontrado;
import exceptions.ParametrosIncorretos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CEP para busca: ");
        String cep = scanner.nextLine();

        try {
            Api api = new Api();
            api.CreateClient();
            api.Url(cep);
            api.CreateRequest();
            var response = api.CreateResponse();
            if (response.statusCode() == 400)
                throw new ParametrosIncorretos("Os dados inseridos para pesquisar o CEP foram inseridos incorretamente.\nInsira apenas os 8 digitos do seu CEP.");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            EnderecoRecord record = gson.fromJson(api.getResponse().body(), EnderecoRecord.class);

            if(record == null) throw new EnderecoNuloEncontrado("Não foi possível encontrar um endereço com o CEP informado.");

            Endereco enderecoPesquisado = new Endereco(record);
            FileWriter endereco = new FileWriter(String.format("%s.json", enderecoPesquisado.getCep()));
            endereco.write(gson.toJson(enderecoPesquisado));
            endereco.close();

            System.out.println("Endereço encontrado com sucesso!");
            System.out.println(enderecoPesquisado);

        }catch (ParametrosIncorretos ex) {
            System.out.println(ex.getMessage());
        }catch(EnderecoNuloEncontrado ex){
                System.out.println(ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }




    }
}
