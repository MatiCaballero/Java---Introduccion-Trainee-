/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author Matia
 */
public class Eje23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector:");
        int n = leer.nextInt();
        System.out.println("Ingrese el numero que desea encontrar");
        int buscar = leer.nextInt();
        int vector[] = new int[n];
        int c, i;
        c = 0;
        for (i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100 - 1);
        }
        for (i = 0; i < n; i++) {
            if (vector[i] == buscar){
                c++;
                System.out.println("Se encontro el numero: "+buscar+" en el vector en la posicion: "+i+" ");
            }
        }
                    System.out.println("El numero se encontro: "+c+" veces en el vector");

    }
}
