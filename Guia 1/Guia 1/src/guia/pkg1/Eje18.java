package guia.pkg1;

import java.util.Scanner;

public class Eje18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String ci, cj, ck;
        System.out.println("Contador");
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i == 3 || j == 3 || k == 3) {
                        ci = String.valueOf(i); /*Convierte ci en cadena*/
                        cj = String.valueOf(j);
                        ck = String.valueOf(k);
                        if (ci.equals("3")) {
                            ci = ("E");
                        }
                        if (cj.equals("3")) {
                            cj = ("E");
                        }
                        if (ck.equals("3")) {
                            ck = ("E");
                        }
                        System.out.println(ci + "-" + cj + "-" + ck);
                    } else{
                            System.out.println(i + "-" + j + "-" +k);}
                }
            }
        }
    }
}


