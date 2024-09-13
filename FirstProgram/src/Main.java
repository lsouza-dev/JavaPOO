import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente("Luiz Fabiano de Souza","Corrente",1000);
        boolean operando = true;

        System.out.println("***********************************");
        System.out.println(String.format("Nome: \t%s \nTipo conta: \t%s \nSaldo inicial: \tR$ %.2f",cliente.getNome(),cliente.getTipoDeConta(),cliente.getSaldo()));
        System.out.println("***********************************\n\n");

        while (operando){
            System.out.println("Operações\n");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Receber Valor");
            System.out.println("3- Transferir Valor");
            System.out.println("4- Sair\n");
            System.out.println("Digite a opção desejada:");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(String.format("Seu saldo é: R$ %.2f",cliente.getSaldo()));
                    break;
                case 2:
                    System.out.println("Digite o valor à ser recebido: ");
                    double valorRecebido = scanner.nextDouble();

                    if(valorRecebido > 0){
                        cliente.ReceberValor(valorRecebido);
                    }else{
                        System.out.println("Não é possível receber esse valor.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja tranferir: ");
                    double valorTransferido =  scanner.nextDouble();

                    if(valorTransferido > 0){
                        cliente.TransferirValor(valorTransferido);
                    }else{
                        System.out.println("Não é possível transferir esse valor.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    operando = false;
                    break;
                default:
                    System.out.println("CONTINUA");
                    break;

            }

        }
    }
}