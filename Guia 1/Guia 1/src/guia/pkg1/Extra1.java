package guia.pkg1;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa un tiempo  en minutos: ");
        int minutos = leer.nextInt();
        int horas, dias;
        dias = 0;
        horas = minutos / 60;
        if (horas >= 24) {
            dias = horas / 24;
            horas = horas - (dias * 24);
        }
        System.out.println("Dias: " + dias + " horas: " + horas);
    }
}
