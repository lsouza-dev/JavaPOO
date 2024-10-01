package whriter.arquivo;

import java.io.FileWriter;

public class Principal {
    public static void main(String[] args) {
        String conteudo = "Conteúdo a ser gravado no arquivo.";

        try{

            FileWriter whriter = new FileWriter("arquivo.txt");
            whriter.write(conteudo);
            whriter.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
