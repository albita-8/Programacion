//Alba Agüera Cuadra

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float mayor;
        float menor;
        float volumen;

        Scanner escaner = new Scanner(System.in).useLocale(Locale.ENGLISH) ;
        System.out.println("\033[1m VOLUMEN DE UN TOROIDE \033[0m ");
        System.out.println("\033[1m ===================== \033[0m ");

        System.out.printf("Introduzca el radio mayor en (cms): ");
        mayor=escaner.nextFloat() ;

        System.out.printf("Introduzca el radio menor en (cms): ");
        menor=escaner.nextFloat() ;

        volumen= 2*(3.1416f*3.1416f)*mayor*(menor*menor);

        System.out.printf("El volumen del toroide es de\033[1m \033[31m %f cm \u00B3 \033[0m ", volumen);
    }
}
