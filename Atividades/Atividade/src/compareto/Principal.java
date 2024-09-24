package compareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        Pessoa luiz = new Pessoa("Luiz",20,65);
        Pessoa helena = new Pessoa("Helena",16,50);
        Pessoa mary = new Pessoa("Mary",7,18);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(mary);
        pessoas.add(luiz);
        pessoas.add(helena);

        System.out.println(pessoas);
        // Alfabético
        Collections.sort(pessoas);
        System.out.println(pessoas);

        //Por peso
        pessoas.sort(Comparator.comparing(Pessoa::getPeso));
        System.out.println(pessoas);

        // Por idade
        pessoas.sort(Comparator.comparing(Pessoa::getIdade));
    }
}
