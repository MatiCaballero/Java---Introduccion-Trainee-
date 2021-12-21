package guia.pkg1;

import java.util.Scanner;

public class Eje19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i, j;
        System.out.println("Ingrese un  numero: ");
        int n = leer.nextInt();

        for (i = 0; i <= n - 1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (i = 0; i <= n - 3; i++) {
            System.out.print("*");
            for (j = 0; j <= (n - 3); j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
//        // System.out.println("");
        for (i = 0; i <= n - 1; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
