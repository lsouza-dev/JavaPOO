package br.com.listadecompras.modelos;

import java.util.List;

public class Compras {

    private static int compraId = -1;
    private Cliente cliente;
    private List<Produto> produtos;

    public Compras(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
        compraId++;
    }

    public Compras(Cliente cliente) {
        this.cliente = cliente;
        compraId++;
    }

    public int getCompraId() {
        return compraId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String exibirProdutos(List<Produto> prod){
        StringBuilder produtosBuilder = new StringBuilder();
        prod.forEach(item -> {
            produtosBuilder.append(String.format("Nome: %s | Valor: R$%.2f \n", item.getNome(),item.getValor()));

        });

        String produtos = produtosBuilder.toString();
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\n%s \nProdutos:\n%s", this.getCompraId(),this.getCliente(),this.exibirProdutos(this.getProdutos()));
    }
}
