package guia.pkg1;

import java.util.Scanner;

public class Eje13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int nota;
        do{
            System.out.println("Ingrese una nota:");
            nota = leer.nextInt();
        }while(nota < 1 || nota > 10);
        System.out.println("La nota ingresada corresponde entre 1 y 10");
    }
}
