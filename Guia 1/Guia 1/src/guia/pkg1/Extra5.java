package guia.pkg1;

import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tipo de socio: (A,B o C) :");
        String clase = leer.next();
        clase = clase.toLowerCase();
        double descuento;
        System.out.println("Ingrese el precio del tratamiento: ");
        long tratamiento = leer.nextLong();
        if ((clase.equals("a")) || (clase.equals("b")) || (clase.equals("c"))) {
            switch (clase) {
                case "a":
                    descuento = tratamiento - (tratamiento * 0.5);
                    System.out.println("El precio total a pagar es: " + descuento);
                    break;
                case "b":
                    descuento = tratamiento - (tratamiento * 0.35);
                    System.out.println("El precio total a pagar es: $" + descuento);

                    break;
                case "c":
                    descuento = tratamiento;
                    System.out.println("El precio total a pagar es: " + descuento);

                    break;
            }

        }
    }

}
