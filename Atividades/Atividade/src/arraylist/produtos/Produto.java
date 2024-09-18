package arraylist.produtos;

public class Produto {
    private String produto;
    private double preco;
    private double valorTotal;
    private double media;

    public Produto(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularTotal(){
        valorTotal += this.media;
        return valorTotal;
    }

    public double calcularMedia(double valor,int quantidade){
        return valor / quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produto='" + produto + '\'' +
                ", preco=" + preco +
                '}';
    }
}
