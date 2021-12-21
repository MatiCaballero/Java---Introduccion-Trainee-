package guia.pkg1;

import java.util.Scanner;

public class ANEXO28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matrizM[][] = new int[10][10];
        int matrizP[][] = new int[3][3];
        int i, j, x, z, s, i1, j1;
        s = 0;
        x = 0;
        z = 0;
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
        for (x = 0; x < 3; x++) {
            for (z = 0; z < 3; z++) {
                matrizP[x][z] = leer.nextInt();
            }
        }
        for (x = 0; x < 3; x++) {
            for (z = 0; z < 3; z++) {
                System.out.print("[ " + matrizP[x][z] + " ]");
            }
            System.out.println("");
        }
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (matrizM[i][j] == matrizP[0][0] && matrizM[i][j + 1] == matrizP[0][1]) {
                    i1 = i;
                    j1 = j;
                    // System.out.println(+i1);
                    // System.out.println(+j1);
                    x = 0;
                    z = 0;
                    for (i = i1; i < i1 + 3; i++) {
                        for (j = j1; j < j1 + 3; j++) {
                            //System.out.println(+i);
                            //System.out.println("M:" + matrizM[i][j]);
                            //System.out.println("p:" + matrizP[x][z]);
                            if (matrizM[i][j] == matrizP[x][z]) {
                                s++;
                                System.out.println(+s);
                                System.out.println("M:" + matrizM[i][j]);
                                System.out.println("p:" + matrizP[x][z]);
                            }

                            z++;
                        }
                        z = 0;
                        x++;
                    }
                    if (s == 9) {
                        System.out.println("La matriz P esta dentro de M");
                    } else {
                        System.out.println("xxx No corresponde xxx");
                    }
                    break;
                }
            }
        }
    }
}
