package guia.pkg1;

import java.util.Scanner;

public class Eje11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escribir una frase");
        String frase = leer.next();

        if ((frase.substring(0, 1)).equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incoorecto");
        };
    }

}
