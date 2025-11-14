//Alba Agüera Cuadra

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int codigo;
        float precio;
        float unidades;
        float descuento;
        float calculo;
        float operacion;
        float IVA;
        float suma;

        Scanner escaner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("\033[1m TANGO MODAS \033[0m");
        System.out.println("\033[1m ============ \033[0m");

        System.out.printf("Introduce código de atrículo: ");
        codigo=escaner.nextInt();

        System.out.printf("Introduce precio: ");
        precio=escaner.nextFloat();

        System.out.printf("Introduce unidades vendidas: ");
        unidades=escaner.nextFloat();

        System.out.print("Introduce descuento (%): ");
        descuento=escaner.nextFloat();

        System.out.printf("\n Su ticket: ");

        System.out.println("\033[1m \n TANGO MODAS \033[0m");
        System.out.println("\033[1m ============ \033[0m");

        calculo= unidades*precio;
        operacion=-(0.1f*calculo);
        IVA=0.16f*calculo ;
        suma=calculo+operacion+IVA;

        System.out.printf("%d          %.2f €\n", codigo, precio);
        System.out.printf("%.0f uds.          %.2f €\n", unidades, calculo);
        System.out.println("(-10%)           " + operacion+ "€");
        System.out.println("(16% IVA)         " +IVA +"€");
        System.out.printf("\033[1m \033[47m TOTAL          %.2f€ \033[0m", suma);
    }
}
