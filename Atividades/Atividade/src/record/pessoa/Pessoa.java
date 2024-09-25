package record.pessoa;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String estadoCivil;
    private String genero;

    public Pessoa(String nome, String cpf, int idade, String estadoCivil, String genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
    }

    public Pessoa(PessoaRecord pessoaRecord){
        this.nome = String.valueOf(pessoaRecord.nome());
        this.cpf = String.valueOf(pessoaRecord.nome());
        this.idade = Integer.valueOf(pessoaRecord.idade());
        this.estadoCivil = String.valueOf(pessoaRecord.estadoCivil());
        this.genero = String.valueOf(pessoaRecord.genero());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", genero='" + genero + '\'' ;
    }
}
