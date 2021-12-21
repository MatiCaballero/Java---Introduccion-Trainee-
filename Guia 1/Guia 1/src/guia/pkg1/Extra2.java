package guia.pkg1;

import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int x, y, z, w;
        System.out.println("Ingrese un valor para A,B,C y D: ");
        System.out.println("A: ");
        int a = leer.nextInt();
        System.out.println("B: ");
        int b = leer.nextInt();
        System.out.println("C: ");
        int c = leer.nextInt();
        System.out.println("D: ");
        int d = leer.nextInt();
        w = a;
        x = b;
        y = c;
        z = d;
        b = y;
        c = w;
        a = z;
        d = x;
        System.out.println("El valor de  A = " + a);
        System.out.println("El valor de  B = " + b);
        System.out.println("El valor de  C = " + c);
        System.out.println("El valor de  D = " + d);

    }

}
