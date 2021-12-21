package guia.pkg1;

import java.util.Scanner;

public class Extra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros a dividir mayores a 1.");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int r1;
        int c = 0;
        r1 = n1;
        if (n1 > 1 && n2 > 1) {
            do {
                System.out.println(+r1);
                r1 = n1 - n2;
                n1=r1;
                c++;
            } while (r1 > n2);
            System.out.println("El residuo es: " + r1 + " y el cociente es: " + c);
        }
    }

}
