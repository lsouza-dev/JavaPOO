package trycatch.divisaoporzero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite o primeiro número");
            double primeiroNumero = scanner.nextDouble();
            System.out.println("Digite o segundo número");
            double segundoNumero = scanner.nextDouble();
            if(segundoNumero == 0){
                throw new ArithmeticException("Não é possível dividir por 0");
            }
            System.out.println(String.format("Resultado da divisião: ", primeiroNumero/segundoNumero));
        }catch(InputMismatchException ex){
            System.out.println("Insira um número e tente novamente.");
        }

    }
}
