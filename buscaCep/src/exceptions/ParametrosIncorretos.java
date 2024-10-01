package exceptions;

public class ParametrosIncorretos extends RuntimeException{

    private String mensagem;

    @Override
    public String getMessage() {
        return this.mensagem;
    }

    public ParametrosIncorretos(String mensagem) {
        this.mensagem = mensagem;
    }
}
