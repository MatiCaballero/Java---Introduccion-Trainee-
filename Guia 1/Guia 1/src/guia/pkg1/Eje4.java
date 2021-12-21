package guia.pkg1;

import java.util.Scanner;

public class Eje4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escribir una frase");
        String frase = leer.next();
        System.out.println("La frase convertida en mayuscula es: " + frase.toUpperCase());
        System.out.println("La frase convertida en minuscula es: " + frase.toLowerCase());
    }
}
