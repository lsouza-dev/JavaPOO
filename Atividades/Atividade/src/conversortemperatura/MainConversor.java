package conversortemperatura;

import java.util.Scanner;

public class MainConversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de conversão\n[1] - Fahrenheit para Celcius \t[2] - Celcius para Fahrenheit\nEscolha:");
        int opcao = scanner.nextInt();

        if(opcao == 1 || opcao == 2){
            System.out.println("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();

            ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

            if(opcao == 1){
                conversor.fahrenheitParaCelcius(temperatura);
            }else{
                conversor.celciusParaFahrenheit(temperatura);
            }
        }

    }
}
