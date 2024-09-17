package calculadora;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        System.out.println("Digite o valor da LARGURA:");
        double largura = scan.nextDouble();

        System.out.println("Digite o valor da ALTURA:");
        double altura = scan.nextDouble();

        System.out.println(
                """
                Digite a operação desejada:
                [1] - Calcular Área
                [2] - Calcular Perímetro
                Escolha: 
                """);
        int escolha = scan.nextInt();

        if(escolha == 1){
            System.out.println(String.format("O VALOR DA ÁREA É: %.2f.",calculadora.calcularArea(altura,largura)));
        }else{
            System.out.println(String.format("O VALOR DO PERÍMETRO É: %.2f.",calculadora.calcularPerimetro(altura,largura)));
        }
    }
}
