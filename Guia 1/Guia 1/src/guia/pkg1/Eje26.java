package guia.pkg1;

import java.util.Scanner;

public class Eje26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matriza[][] = new int[3][3];
        int i, j, n;
        int c;
        c = 0;
        System.out.println("Ingrese los numeros comprendidos en la matriz:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                // matriza[i][j] = (int) (Math.random() * 20 - 10);
                matriza[i][j] = n = leer.nextInt();
            }
            System.out.println("");
        }
        //Muestra Matriz//
        System.out.println(" Matriz:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("[ " + matriza[i][j] + " ]");
            }
            System.out.println("");
        }
        //MATRIZ TRANSPUESTA //

        System.out.println("");
        System.out.println("Matriz tranpuesta: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {;
                System.out.print("[ " + matriza[j][i] + " ]");
            }
            System.out.println("");
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if ((matriza[i][j] == -(matriza[j][i]))) {
                    c++;
                }
            }
        }
        if (c++ == 9) {
            System.out.println("- - - La matriz es anti simetrica- - -");
        }else{
            System.out.println("x x x La matriz no es anti simietrica x x x");
        }
    }

}
