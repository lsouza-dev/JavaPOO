package trycatch.senhausuario;

import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite seu usuário:");
            String usuario = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = scanner.nextLine();
            Usuario user = new Usuario(usuario,senha);
            System.out.println("Usuário cadastrado com sucesso.");
        }catch(SenhaInvalidaException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
