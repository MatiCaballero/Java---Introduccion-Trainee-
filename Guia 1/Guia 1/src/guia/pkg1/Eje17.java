package guia.pkg1;

import java.util.Scanner;

public class Eje17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena;
        int longitud,correcta,incorrecta;
        correcta=0;
        incorrecta=-1;
       
        do {
            System.out.println("Ingrese una cadena:");
            cadena = leer.next();
            longitud = cadena.length();
            if (longitud == 5 && (cadena.substring(0, 1).equals("X")) && (cadena.substring(4, 5).equals("O"))) {
                correcta++;
            }else{
                incorrecta++;
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de cadenas correctas es: "+correcta);
        System.out.println("La cantidad de cadenas incorrectas es: "+incorrecta);
    }
}
