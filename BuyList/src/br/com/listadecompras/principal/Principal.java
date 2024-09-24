package br.com.listadecompras.principal;

import br.com.listadecompras.modelos.Cliente;
import br.com.listadecompras.modelos.Compras;
import br.com.listadecompras.modelos.Produto;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean adicionandoProduto = true;
        boolean haClientes = true;

        while (haClientes){
            //Cadastrando informações do cliente
            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.next();
            System.out.println("Digite o valor de crédito:");
            double valorCredito = scanner.nextDouble();

            // Criando o cliente e sua respectiva compra
            Cliente cliente = new Cliente(nomeCliente);
            Compras compras = new Compras(cliente);
            List<Produto> produtos = new LinkedList<>();

            double valorCompra = 0;
            // Enquanto estiver comprando novos produtos...
            while(adicionandoProduto){

                // Recebendo as informações do produto
                System.out.println("\nDigite o nome do produto: ");
                String nomeProduto = scanner.next();
                System.out.println("Digite o valor do produto: ");
                double valorProduto = scanner.nextDouble();
                //Criando um novo produto
                Produto produto = new Produto(nomeProduto,valorProduto);

                // Verificando se é possível comprar esse novo produto
                if(valorCredito - valorProduto >= 0){

                    valorCompra += produto.getValor();
                    valorCredito -= produto.getValor();
                    produtos.add(produto);

                    System.out.println("\nDeseja comprar outro produto? \n[1] Sim \t[2] Não\nResposta: ");
                    int resposta = scanner.nextInt();

                    if(resposta == 2){
                        // Parando o loop de inserção de produtos ao carrinho
                        adicionandoProduto = false;
                    }
                }else{
                    System.out.println("\n\nSaldo insuficiente para continuar comprando");
                    // Parando o loop de inserção de produtos ao carrinho
                    adicionandoProduto = false;
                }
            }

            // Exibindo informações da conta para o cliente
            System.out.println("*******************************************************");
            System.out.println(String.format("Valor da compra: %.2f", valorCompra));
            System.out.println(String.format("Valor em crédito: %.2f", valorCredito));
            System.out.println("*******************************************************\n");
            // Adicionando a lista de compras à compra do cliente
            compras.setProdutos(produtos);
            // Ordenando a lista de compras do cliente pelo menor valor
            compras.getProdutos().sort(Comparator.comparing(Produto::getValor));
            System.out.println(compras);

            System.out.println("Há outro cliente na fila? \n[1] Sim \t[2] Não\nResposta: ");
            int novoCliente = scanner.nextInt();

            if(novoCliente == 1){
                System.out.println("\n\nCadastrando novo cliente:");
                adicionandoProduto = true;
            }else{
                haClientes = false;
            }
        }
    }
}
