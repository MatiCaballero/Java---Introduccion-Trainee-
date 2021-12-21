
package guia.pkg1;

import java.util.Scanner;

public class Eje8 {

    public static void main(String[] args) {
               Scanner leer = new Scanner(System.in).useDelimiter("\n");
               System.out.println("Ingrese un nuero:");
               int n = leer.nextInt();
               if(n % 2 == 0){
                   System.out.println("El numero ingresado es par");
               } else {
                   System.out.println("El numero ingresado es impar");
               }
    }
    
}
