package guia.pkg1;

import java.util.Scanner;

public class Eje28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matrizM[][] = new int[10][10];
        int matrizP[][] = new int[3][3];
        int i, j, s;
        s = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 100 - 1);
            }
        }
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("[ " + matrizM[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("Ingrese 9 numeros:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matrizP[i][j] = leer.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("[ " + matrizP[i][j] + " ]");
            }
            System.out.println("");
        }
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    if (matrizM[i][j + 1] == matrizP[0][1]) {
                        if (matrizM[i][j + 2] == matrizP[0][2]) {
                            if (matrizM[i + 1][j] == matrizP[1][0]) {
                                if (matrizM[i + 1][j + 1] == matrizP[1][1]) {
                                    if (matrizM[i + 1][j + 2] == matrizP[1][2]) {
                                        if (matrizM[i + 2][j] == matrizP[2][0]) {
                                            if (matrizM[i + 2][j + 1] == matrizP[2][1]) {
                                                if (matrizM[i + 2][j + 2] == matrizP[2][2]) {
                                                    System.out.println("La matriz P esta dentro de la matriz P ");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
