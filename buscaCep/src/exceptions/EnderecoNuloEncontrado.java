package exceptions;

public class EnderecoNuloEncontrado extends RuntimeException{
    String mensagem;

    @Override
    public String getMessage() {
        return this.mensagem;
    }

    public EnderecoNuloEncontrado(String mensagem) {
        this.mensagem = mensagem;
    }
}
