package guia.pkg1;

import java.util.Scanner;

public class Eje25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matriz[][] = new int[4][4];
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j]= (int) (Math.random()*100-1);
                System.out.print("[ "+matriz[i][j]+" ]");
            }
            System.out.println("");
        }
    }
}
