//Alba Agüera Cuadra

import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        double masa;
        double fuerza;
        double aceleracion;

        Scanner escaner = new Scanner(System.in);

        System.out.printf("\033[1m ACELERACIÓN SEGÚN LA SEGUNDA LEY DE NEWTON \033[0m \n");
        System.out.printf("\033[1m ========================================== \033[0m \n");

        System.out.printf("Introduzca la masa del objeto en kilogramos: ");
        masa=escaner.nextDouble();

        System.out.printf("Introduzca la fuerza neta aplicada en Newtons: ");
        fuerza=escaner.nextDouble();

        aceleracion=fuerza/masa ;

        System.out.printf("La aceleración del objeto aproximadamente es: %.2f m/s \u00B2", aceleracion);
    }
}