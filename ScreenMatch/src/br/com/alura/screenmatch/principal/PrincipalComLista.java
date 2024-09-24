package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Avatar",2020,"SEI LÁ");
        Filme meuFilme2 = new Filme("O Poderoso Chefão",1970,"SEI LÁ");
        Filme meuFilme3 = new Filme("Dogville",2003,"SEI LÁ");
        Serie lost = new Serie("Lost",2000);
        meuFilme.avalia(10);

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(meuFilme);
        titulos.add(meuFilme2);
        titulos.add(meuFilme3);
        titulos.add(lost);

        titulos.forEach(item -> {
            if(item instanceof Filme filme && filme.getClassificacao() > 2 ) {
                System.out.println(String.format("Classificação: %d", filme.getClassificacao()));
            }
        });

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Luiz Fabiano");
        System.out.println(buscaPorArtista);

        // Ordem alfabética
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println(titulos);

        // Ordendando por ordem alfabética, porém, com a necessidade de
        // implementar a classe Colections ao super
        Collections.sort(titulos);
        System.out.println(titulos);

        // Ordenando em ordem crescente de ano de lançamento utilizando
        // a classe Comparator e o método comparing, passando como parâmetro
        // o titulo e o que queremos  comparar;
        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(titulos);
    }
}
