package arraylist.animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        Cachorro rex = new Cachorro("Rex","Preto");
        Cachorro doug = new Cachorro("Doug","Caramelo");
        Animal naja = new Animal("Naja","Branco");

        animais.add(rex);
        animais.add(doug);
        animais.add(naja);

        animais.forEach(animal -> {
            if(animal instanceof Cachorro ){
                System.out.println("É um cachorro");
            }else{
                System.out.println("É outro animal");
            }
        });
    }
}
