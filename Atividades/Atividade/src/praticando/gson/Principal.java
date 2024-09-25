package praticando.gson;


import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        String json = """
                {
                    "nome":"Luiz Fabiano de Souza",
                    "idade":20,
                    "email":"luizfabianods04@gmail.com"
                }
                """;

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa.getNome());
    }
}
