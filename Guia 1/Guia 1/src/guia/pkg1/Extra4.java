package guia.pkg1;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero del 1 al 10:");
        int numero = leer.nextInt();
        String romano;
        if (numero >= 1 && numero <= 10) {
            switch (numero) {
                case 1:
                    romano = "I";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);
                    break;
                case 2:
                    romano = "II";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);

                    break;
                case 3:
                    romano = "III";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);

                    break;
                case 4:
                    romano = "IV";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);

                    break;
                case 5:
                    romano = "V";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);

                    break;
                case 6:
                    romano = "VI";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);

                    break;
                case 7:
                    romano = "VII";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);

                    break;
                case 8:
                    romano = "VIII";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);

                    break;
                case 9:
                    romano = "IX";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);

                    break;
                case 10:
                    romano = "X";
                    System.out.println("El numero: " + numero + " convertido a numero romano es: " + romano);

                    break;

            }
        } else {
            System.out.println("Usted ingreso un numero no correspondido entre 1 y 10.");
        }
    }

}
