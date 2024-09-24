package br.com.listadecompras.modelos;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double valor;


    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - Valor: %.2f\n", this.getNome(),this.getValor());
    }

    @Override
    public int compareTo(Produto outroProduto) {
        if(this.getValor() > outroProduto.getValor()){
            return 1;
        }else if(this.getValor() < outroProduto.getValor()){
            return -1;
        }else{
            return 0;
        }
    }
}
