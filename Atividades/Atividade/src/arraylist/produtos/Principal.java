package arraylist.produtos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto nescau = new Produto("Nescau",9.43);
        Produto chocolate = new Produto("Diamante Negro",5.49);
        Produto refrigerante = new Produto("Coca-Cola",10.99);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(nescau);
        produtos.add(chocolate);
        produtos.add(refrigerante);

        produtos.forEach(System.out::println);
    }
}
