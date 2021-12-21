package guia.pkg1;

import java.util.Scanner;

public class Eje16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, sum, total;
        sum = 0;
        total = 0;
        do {
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            sum++;
            if (num > 0) {
                total = total + num;
            }
            if (num == 0) {
                System.out.println("Se capturo el numero 0.");
                break;
            }
        } while (sum != 20);
        System.out.println("La suma total de los numeros ingresados es: "+total);
    }

}
