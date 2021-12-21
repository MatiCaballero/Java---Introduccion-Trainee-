
package guia.pkg1;

import java.util.Scanner;

public class Eje6 {

    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
          System.out.println("Ingrese un numero entero: ");
          int n = leer.nextInt();
          System.out.println("El doble de: "+n +" es: " +(n*2));
          System.out.println("El triple de: "+n+ " es: "+(n*3));
          System.out.println("La raiz cuadrada de: "+n+ " es: " +Math.sqrt(n));
    }
    
}
