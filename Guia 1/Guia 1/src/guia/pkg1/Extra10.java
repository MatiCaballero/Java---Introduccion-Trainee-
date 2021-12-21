package guia.pkg1;

import java.util.Scanner;

public class Extra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n1, n2, n, div;
        int c = 0;
        n1 = (int) (Math.random() * 10 - 0);
        n2 = (int) (Math.random() * 10 - 1);
        div = n1 / n2;
        System.out.println(+div);
        do {
            c++;
            if (c == 1) {
                System.out.println("Ingrese un numero: ");
                n = leer.nextInt();
            } else {
                System.out.println("Numero incorrecto. Ingrese otro numero: ");
                n = leer.nextInt();
            }
        } while (div != n);
        System.out.println("El numero ingresado es correcto.");
    }

}
