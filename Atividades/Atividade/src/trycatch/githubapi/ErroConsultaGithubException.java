package trycatch.githubapi;

public class ErroConsultaGithubException extends RuntimeException {
    private String mensagem;

    @Override
    public String getMessage() {
        return this.mensagem;
    }

    public ErroConsultaGithubException(String mensagem) {
        this.mensagem = mensagem;
    }
}
