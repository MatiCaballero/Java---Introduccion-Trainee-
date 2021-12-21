package guia.pkg1;

import java.util.Scanner;

public class Extra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero: ");
        int n = leer.nextInt();
        int div, c;
        c = 0;
        do {
            div = n / 10;
            n = div;
            //System.out.println(div);
            c++;
        } while (div != 0);
        System.out.println("La cantidad de digitos del numero es: " + c);
    }
}
