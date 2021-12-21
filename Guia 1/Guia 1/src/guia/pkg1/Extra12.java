package guia.pkg1;

import java.util.Scanner;

public class Extra12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la alutra de la escalera: ");
        int a = leer.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
        System.out.println("");
    }

}
