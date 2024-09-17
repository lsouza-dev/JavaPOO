package tabuada;

import java.util.Scanner;

public class MainTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número para saber sua tabuada: ");
        int numero = scanner.nextInt();
        System.out.println("Digite a quantidade de multiplicações: ");
        int qtdMultiplicacoes = scanner.nextInt();

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.fazerTabuada(numero,qtdMultiplicacoes);

    }
}
