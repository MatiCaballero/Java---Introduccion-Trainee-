package guia.pkg1;

import java.util.Scanner;

public class Eje12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de motor (Entre 1 y 4):");
        int tipoMotor = leer.nextInt();
        if (tipoMotor >= 1 && tipoMotor <= 4) {
            if (tipoMotor == 1) {
                System.out.println("La bomba, es una bomba de agua");
            }
            if (tipoMotor == 2) {
                System.out.println("La bomba, es una bomba de gasolina");
            }
            if (tipoMotor == 3) {
                System.out.println("La bomba, es una bomba de hormigon");
            }
            if (tipoMotor == 4) {
                System.out.println("La bomba, es una bomba de pasta alimenticia");
            }
        } else {
            System.out.println("El numero de motor ingresado, no corresponde");
        }
    }
}
