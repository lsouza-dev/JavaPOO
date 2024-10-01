package trycatch.senhausuario;

public class SenhaInvalidaException extends RuntimeException {

    String mensagem;

    public SenhaInvalidaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
