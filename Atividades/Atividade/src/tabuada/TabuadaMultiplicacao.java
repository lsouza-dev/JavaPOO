package tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void fazerTabuada(int valor,int qtdRepeticoes) {
        for (int i = 1 ; i <= qtdRepeticoes; i++){
            int resultado = valor * i;
            System.out.println(String.format("%d x %d = %d",valor,i,resultado ));
        }
    }
}
