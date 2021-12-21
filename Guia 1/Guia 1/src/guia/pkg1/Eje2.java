package guia.pkg1;

import java.util.Scanner;

public class Eje2 {

    public static void main(String[] args) {
        /* Declaro la funcion leer para pedir un dato al usuario*/
        Scanner leer = new Scanner(System.in);
        /*Le pido un dato al usuario a travez de un mensaje por pantalla*/
        System.out.println("Escriba un numero:");
        /*agrego la variable n1 como entero y pido que lea el dato ingresado por el usuario*/
        int n1 = leer.nextInt();
        System.out.println("Escriba otro numero:");
        /*Defino la variable n2 como enterio y pido que lea el dato ingresado por el usuario*/
        int n2 = leer.nextInt();
        /*Imprimo el resultado entre la suma de la variable n1 y n2*/
        System.out.println("El resultado es: " + (n1 + n2));
    }

}
