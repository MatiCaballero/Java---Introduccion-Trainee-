package guia.pkg1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int personas = leer.nextInt();
        System.out.println("Ingrese la altura de las personas en metros y cm: ");
        double altura, sumalt, prom, sum;
        sum = 0;
        sumalt = 0;
        prom = 0;
        for (int i = 0; i < personas; i++) {
            altura = sc.nextDouble();
            sum = sum + altura;
            if (altura < 1.60) {
                sumalt++;
            }
            prom = sum / personas;
        }
        System.out.println("La cantidad de personas que miden menos de 1.60 es: " + sumalt);
        System.out.println("La altura promedio es: " + prom);
    }

}
