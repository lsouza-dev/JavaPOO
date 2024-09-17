package musicapplication.modelo;

import musicapplication.heranca.Audio;
import musicapplication.interfaces.AudioInterface;

public class Podcast extends Audio implements AudioInterface {

    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int curtir() {
        this.curtidas += 1;
        return this.curtidas;
    }

    @Override
    public void reproduzir(Audio audio) {
        System.out.println(String.format("O Podcast %s está sendo reproduzido...", this.titulo));
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "host='" + host + '\'' +
                ", descricao='" + descricao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", totalDeReproducoes=" + totalDeReproducoes +
                ", curtidas=" + curtidas +
                ", classificacao=" + classificacao +
                '}';
    }
}
