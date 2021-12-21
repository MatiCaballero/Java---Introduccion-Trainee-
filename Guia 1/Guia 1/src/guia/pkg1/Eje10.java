package guia.pkg1;

import java.util.Scanner;

public class Eje10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escribir una frase o palabra:");
        String frase = leer.next();
        int longitud = frase.length();
        if (longitud == 8) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto");
        }

    }

}
