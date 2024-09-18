package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Avatar",2020,"SEI LÁ");
        meuFilme.setDuracaoEmMinutos(120);

        Filme meuFilme2 = new Filme("O Poderoso Chefão",1970,"SEI LÁ");

        meuFilme2.setDuracaoEmMinutos(120);

        Filme meuFilme3 = new Filme("Dogville",2003,"SEI LÁ");
        meuFilme3.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(meuFilme3);

        Serie lost = new Serie("Lost",2000);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(lost);
        episodios.setTotalVisualizacoes(300);
        filtro.filtra(episodios);

        System.out.println(meuFilme);
    }
}