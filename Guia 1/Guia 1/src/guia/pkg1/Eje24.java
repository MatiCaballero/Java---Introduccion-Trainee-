
package guia.pkg1;

import java.util.Scanner;

public class Eje24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector:");
        int n = leer.nextInt();
        int i, a, b, c, d, e;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        int vector[] = new int[n];
        for (i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000 - 1);
            System.out.println(+vector[i]);
        }
        for (i = 0; i < n; i++) {
            if (vector[i] > 0 && vector[i] < 10) {
                a++;
            }
            if (vector[i] > 9 && vector[i] < 100) {
                b++;
            }
            if (vector[i] > 99 && vector[i] < 1000) {
                c++;
            }
            if (vector[i] > 999 && vector[i] < 10000) {
                d++;
            }
            if (vector[i] > 9999 && vector[i] < 100000) {
                d++;
            }
        }
        System.out.println("1 Digito: " +a);
        System.out.println("2 Digito: " +b);
        System.out.println("3 Digito: " +c);
        System.out.println("4 Digito: " +d);
        System.out.println("5 Digito: " +e);

    }

}
