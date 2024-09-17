package produtos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto cafe = new Produto("Café",7.43,20);
        Produto maca = new Produto("Maçã",4.43,53);
        Produto manga = new Produto("Manga",5.43,15);

        listaDeProdutos.add(cafe);
        listaDeProdutos.add(maca);
        listaDeProdutos.add(manga);

        System.out.println(listaDeProdutos.get(2));
        System.out.println(listaDeProdutos);

        ProdutoPerecivel leite = new ProdutoPerecivel("Leite",5.30,23,"18/09/2024");
        System.out.println(leite);

    }
}
