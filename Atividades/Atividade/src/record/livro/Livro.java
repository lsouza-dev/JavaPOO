package record.livro;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;

    public Livro(String titulo, String autor, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public Livro(LivroRecord record){
        this.titulo = String.valueOf(record.titulo());
        this.autor= String.valueOf(record.autor());
        this.editora = String.valueOf(record.editora());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return  "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'';
    }
}
