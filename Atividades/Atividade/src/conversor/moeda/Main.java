package conversor.moeda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor em dólar para converter para real: ");
        double valDolar = scanner.nextDouble();
        double valorConvertidoReal = conversorMoeda.converterDolarParaReal(valDolar);
        System.out.println(String.format("$ %.2f convertido para Real é: R$ %.2f",valDolar,valorConvertidoReal));

    }
}
