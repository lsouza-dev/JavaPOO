package musicapplication.modelo;

import musicapplication.heranca.Audio;
import musicapplication.interfaces.AudioInterface;

public class Musica extends Audio implements AudioInterface {

    private String album;
    private String artista;
    private String genero;


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int curtir() {
        this.curtidas += 1;
        return this.curtidas;
    }

    @Override
    public void reproduzir(Audio audio) {
        System.out.println(String.format("O Áudio %s está sendo reproduzido...",this.titulo ));
    }

    @Override
    public String toString() {
        return "Musica{" +
                "album='" + album + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", totalDeReproducoes=" + totalDeReproducoes +
                ", curtidas=" + curtidas +
                ", classificacao=" + classificacao +
                '}';
    }
}
