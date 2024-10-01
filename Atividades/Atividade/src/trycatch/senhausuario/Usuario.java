package trycatch.senhausuario;

public class Usuario {
    private String usuario;
    private String senha;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        if(senha.length() < 8){
            throw  new SenhaInvalidaException("A senha deve conter pelo menos 8 caracteres.");
        }
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
