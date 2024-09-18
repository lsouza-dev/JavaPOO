package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Avatar",2020,"SEI LÁ");
        Filme meuFilme2 = new Filme("O Poderoso Chefão",1970,"SEI LÁ");
        Filme meuFilme3 = new Filme("Dogville",2003,"SEI LÁ");
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(meuFilme);
        titulos.add(meuFilme2);
        titulos.add(meuFilme3);
        titulos.add(lost);

        titulos.forEach(item -> {
            System.out.println(item.getNome());
            System.out.println(item.getAnoDeLancamento());
        });

    }
}
