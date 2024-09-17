package lista.pessoas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa luiz = new Pessoa();
        Pessoa helena = new Pessoa();
        Pessoa nete = new Pessoa();

        luiz.setNome("Luiz Fabiano de Souza");
        helena.setNome("Helena Matos dos Santos");
        nete.setNome("Ivanete Matos dos Santos");

        pessoas.add(luiz);
        pessoas.add(helena);
        pessoas.add(nete);

        System.out.println(pessoas.getFirst());
        System.out.println(pessoas.getLast());
        System.out.println(pessoas.size());
        System.out.println(pessoas);

    }
}
