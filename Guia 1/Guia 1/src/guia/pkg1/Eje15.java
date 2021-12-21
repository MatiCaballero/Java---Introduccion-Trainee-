package guia.pkg1;

import java.util.Scanner;

public class Eje15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op;
        System.out.println("Ingrese un numero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese un numero: ");
        int n2 = leer.nextInt();
        do {
            System.out.println("Elija el numero de la operacion que desea realizar:");
            System.out.println("1. Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            op = leer.nextInt();
            switch (op) {
                case (1):
                    System.out.println("La suma de los numeros es: " + (n1 + n2));
                    break;
                case (2):
                    System.out.println("La resta de los numeros es: " + (n1 - n2));
                    break;
                case (3):
                    System.out.println("La multiplicacion de los numeros es:" + (n1 * n2));
                    break;
                case (4):
                    System.out.println("La division de los numeros es:" + (n1 / n2));
                    break;
                default:
                    System.out.println("Ingreso una opcion erronea, vuelva a intentar");
            }
        } while (op != 5);
    }
}
