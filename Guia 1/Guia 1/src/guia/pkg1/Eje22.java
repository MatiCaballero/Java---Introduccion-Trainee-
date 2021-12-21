package guia.pkg1;

import java.util.Scanner;

public class Eje22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i;
        int vector[] = new int[100];
        int c = 100;
        for (i = 0; i < 100; i++) {
            vector[i] = c;
            c--;
            System.out.println("[" + vector[i] + "]");
        }

    }

}
