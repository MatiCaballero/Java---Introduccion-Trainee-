package guia.pkg1;

import java.util.Scanner;

public class Extra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numeros: ");
        int par, n, impar, c;
        n = 1;
        c = 0;
        par = 0;
        impar = 0;
        while (n % 5 != 0) {
            n = leer.nextInt();
            c++;
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Numeros leidos:" + c);
        System.out.println("Numeros impares:" + impar);
        System.out.println("Numeros pares:" + par);
    }

}
