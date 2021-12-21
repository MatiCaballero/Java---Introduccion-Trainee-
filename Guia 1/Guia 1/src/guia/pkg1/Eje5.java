package guia.pkg1;

import java.util.Scanner;

public class Eje5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escribir los grados centigrados:");
        long grados = leer.nextLong();
        System.out.println("El equivalente en grados Fahrenheit es: " + (32 + (9 * grados / 5)));
    }

}
