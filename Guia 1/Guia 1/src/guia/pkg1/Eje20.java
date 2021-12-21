package guia.pkg1;

import java.util.Scanner;

public class Eje20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i,j,n;
        System.out.println("Ingrese 4 numeros: ");
        for (i = 0; i <= 3; i++) {
            n=leer.nextInt();
             if (n>0 && n<21){
                 System.out.print(+n+": ");
                 for (j = 0; j <= n-1; j++){
                     System.out.print("*");
                 }
            }else{
                 System.out.println("Usted ingreso un numero que no esta comprendido entre el 1 y el 20.");}
            System.out.println("");
        }
    }

}
