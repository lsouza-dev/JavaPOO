package arraylist.string;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Luiz");
        strings.add("Fabiano");
        strings.add("de");
        strings.add("Souza");

        strings.forEach(System.out::println);
    }
}
