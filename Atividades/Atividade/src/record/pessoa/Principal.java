package record.pessoa;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        String json = """
                {
                    "Nome":"Luiz Fabiano de Souza",
                    "Cpf":"123.456.789-10",
                    "Idade":20,
                    "EstadoCivil":"Casado",
                    "Genero":"Apaixonado"
                }
                """;
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        PessoaRecord record = gson.fromJson(json,PessoaRecord.class);
        Pessoa pessoa = new Pessoa(record);
        System.out.println(pessoa);
    }
}
