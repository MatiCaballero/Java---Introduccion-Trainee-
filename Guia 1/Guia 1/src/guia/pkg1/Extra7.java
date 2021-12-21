package guia.pkg1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Extra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner sc = new Scanner(System.in);
        int num, c, min, max, suma,prom;
        c = 1;
        min = 9999999;
        max = -1;
        suma = 0;
        System.out.println("Ingrese la cantidad de numeros a ingresar:");
        int cantidad = leer.nextInt();
        while (c != cantidad) {
            c++;
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            suma = suma + num;
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        prom=suma/cantidad;
        System.out.println("El minimo valor ingresado es: "+min);
        System.out.println("El maximo valor ingresado es: "+max);
        System.out.println("El promedio es: "+prom);
    }

}
