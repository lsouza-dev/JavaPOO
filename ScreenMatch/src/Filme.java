public class Filme {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, double avaliacao, int totalDeAvaliacoes, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.avaliacao = avaliacao;
        this.totalDeAvaliacoes = totalDeAvaliacoes;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", incluidoNoPlano=" + incluidoNoPlano +
                ", avaliacao=" + avaliacao +
                ", totalDeAvaliacoes=" + totalDeAvaliacoes +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }

    public static class FilmeBuilder{
        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double avaliacao;
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;

        public FilmeBuilder nome(String nome){
            this.nome = nome;
            return this;
        }

        public FilmeBuilder anoDeLancamento(int anoDeLancamento){
            this.anoDeLancamento = anoDeLancamento;
            return this;
        }
        public FilmeBuilder incluidoNoPlano(boolean incluidoNoPlano){
            this.incluidoNoPlano = incluidoNoPlano;
            return this;
        }
        public FilmeBuilder avaliacao(double avaliacao){
            this.avaliacao = avaliacao;
            return this;
        }
        public FilmeBuilder totalDeAvaliacoes(int totalDeAvaliacoes){
            this.totalDeAvaliacoes = totalDeAvaliacoes;
            return this;
        }
        public FilmeBuilder duracaoEmMinutos(int duracaoEmMinutos){
            this.duracaoEmMinutos = duracaoEmMinutos;
            return this;
        }

        public Filme build(){
            return new Filme(nome,anoDeLancamento,incluidoNoPlano,avaliacao,totalDeAvaliacoes,duracaoEmMinutos);
        }

    }

}
