package guia.pkg1;

import java.util.Scanner;

public class Eje27 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del cuadrado: ");
        int n = leer.nextInt();
        int matriz[][] = new int[n][n];
        int i, j, s, s1, s2, s3;
        s = 0;
        s1 = 0;
        s2 = 0;
        s3 = 0;
        System.out.println("Ingrese " + n * n + " numeros:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(+matriz[i][j]);
            }
            System.out.println("");
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    s = s + matriz[i][j];
                }
                if (i + j == n - 1) {
                    s1 = s1 + matriz[i][j];
                }
                if (i == 0) {
                    s2 = s2 + matriz[i][j];
                }
                if (j == 0) {
                    s3 = s3 + matriz[i][j];
                }
            }
        }
        if (s == s1 && s1 == s2 && s2 == s3) {
            System.out.println(" - - - Es un cuadrado magico - - -");
        } else {
            System.out.println("x x x NO es un cuadrado magico xxx");
        }
    }

}
