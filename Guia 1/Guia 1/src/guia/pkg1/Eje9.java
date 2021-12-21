
package guia.pkg1;

import java.util.Scanner;

public class Eje9 {

    public static void main(String[] args) {
                       Scanner leer = new Scanner(System.in).useDelimiter("\n");
                       System.out.println("Ingrese una frase:");
                       String frase = leer.next();
                       if((frase.toLowerCase()).equals("eureka")){
                           System.out.println("Correcto");
                       } else{
                           System.out.println("Incorrecto");
                       }
    }
    
}
