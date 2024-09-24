package compareto;

public class Pessoa implements  Comparable<Pessoa>{
    private String nome;
    private int idade;
    private float peso;

    public Pessoa(String nome, int idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.getNome().compareTo(outraPessoa.getNome());
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Idade: %d | Peso: %.2f", this.getNome(),this.getIdade(),this.getPeso());
    }
}
