package guia.pkg1;

import java.util.Scanner;

public class Eje7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero:");
        int n1 = leer.nextInt();
        System.out.println("Ingrese un numero entero:");
        int n2 = leer.nextInt();
        if (n1 > n2) {
            System.out.println("El numero mayor es: " + n1);
        } else {
            System.out.println("El numero mayor es: " + n2);
        }
    }
}
