package musicapplication;

import musicapplication.modelo.Musica;
import musicapplication.modelo.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musicaDaHelena = new Musica();
        musicaDaHelena.setAlbum("Nosso Album");
        musicaDaHelena.setArtista("Frank Ocean");
        musicaDaHelena.setGenero("Romântico Apaixonado pelo Luiz");
        musicaDaHelena.setTitulo("Pink Matter");
        musicaDaHelena.setCurtidas(150924);
        musicaDaHelena.setClassificacao(5);
        musicaDaHelena.setDuracao(8.01);
        musicaDaHelena.setTotalDeReproducoes(1);

        musicaDaHelena.reproduzir(musicaDaHelena);
        musicaDaHelena.curtir();
        musicaDaHelena.curtir();

        Podcast videiraVix = new Podcast();
        videiraVix.setHost("Spotify");
        videiraVix.setDescricao("Podcast do culto de celebração do último domingo na parte da manhã.");
        videiraVix.setTitulo("Culto de Celebração - Domingo (Manhã)");
        videiraVix.setCurtidas(283749);
        videiraVix.setClassificacao(5);
        videiraVix.setDuracao(132.5);
        videiraVix.setTotalDeReproducoes(3489);

        videiraVix.reproduzir(videiraVix);
        videiraVix.curtir();
        videiraVix.curtir();
        videiraVix.curtir();

        System.out.println(musicaDaHelena);
        System.out.println(videiraVix);



    }
}
