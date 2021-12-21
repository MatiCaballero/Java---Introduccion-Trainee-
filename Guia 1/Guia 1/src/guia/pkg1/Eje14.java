package guia.pkg1;

import java.util.Scanner;

public class Eje14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma, n2;
        suma = 0;
        System.out.println("Ingrese el numero limite:");
        int numero = leer.nextInt();
        do {
            System.out.println("Ingrese un numero:");
            n2 = leer.nextInt();
            suma = suma + n2;
        } while (suma < numero);
        System.out.println("La suma entre los numeros supero el limite.");
    }

}
