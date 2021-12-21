
package guia.pkg1;

import java.util.Scanner;

public class Extra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de familias: ");
        int fam = leer.nextInt();
        int matriz[] = new int[fam];
       

        for (int i = 0; i < fam; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia: " + i);
            matriz[i]=leer.nextInt();
        }

        
        for (int i = 0; i < fam; i++) {
            System.out.println(+matriz[i]);
        }
    }

}
