package musicapplication.heranca;

public class Audio {
    protected String titulo;
    protected double duracao;
    protected int totalDeReproducoes;
    protected int curtidas;
    protected int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
