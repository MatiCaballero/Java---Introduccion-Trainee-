package guia.pkg1;

import java.util.Scanner;

public class Eje21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el monto en euros que desea convertir:");
        long valor = leer.nextLong();
        System.out.println("Ingrese la opcion de moneda que desea convertir:");
        System.out.println("1) Libra");
        System.out.println("2) Dolar");
        System.out.println("3) Yan");
        String moneda = leer.next();
        funcion(valor, moneda);
    }

    public static void funcion(long valor, String moneda) {
        switch(moneda){
            case "1":
                System.out.println("El valor convertido a Libras es: "+valor*0.86);
                break;
            case "2":
                System.out.println("El valor convertido a Dolar es: "+valor*1.28611);
                break;
            case "3":
                System.out.println("El valor convertido a Yanes es:"+valor*129.852);
                break;
        }
    }
}
