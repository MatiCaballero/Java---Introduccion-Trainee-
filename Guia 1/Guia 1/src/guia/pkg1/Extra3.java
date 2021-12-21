package guia.pkg1;

import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una letra: ");
        String letra = leer.next();
        letra = letra.toLowerCase();
        if (((letra.equals("a")) || (letra.equals("e")) || (letra.equals("i")) || (letra.equals("o")) || (letra.equals("u")))) {
            System.out.println("La letra ingresada es una vocal.");
        }else{
            System.out.println("La letra ingresada es una consonante.");}
    }

}
