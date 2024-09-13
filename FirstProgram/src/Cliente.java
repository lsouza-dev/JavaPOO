import java.sql.SQLOutput;
import java.sql.SQLRecoverableException;

public class Cliente
{
    private String nome = "Luiz Fabiano de Souza";
    private String tipoDeConta = "Corrente";
    private double saldo = 2500.0;

    public Cliente(String nome, String tipoDeConta, double saldo){
        this.nome = nome;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
    }


    public String getNome() {

        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    private void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ReceberValor(double valor){
        System.out.println(String.format("Você recebeu uma transferência de: R$ %.2f",valor));
        setSaldo(valor + saldo);
    }

    public double TransferirValor(double valor){
        if(saldo >= valor){
            System.out.println(String.format("Transferência de R$ %.2f realizada com sucesso!",valor));
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente para transferência.");
        }
        return saldo;
    }
}
