import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        String comida;
        float precio=0;
        String pitufo;
        String bebida;
        float precioBebida=0;
        float precioTotal=0;

        Scanner escaner = new Scanner(System.in);

        System.out.printf("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        comida=escaner.nextLine();

        if (comida.equals("palmera")) {
            precio=1.40f;
        } else if (comida.equals( "donut")) {
            precio=1;
        } else if (comida.equals( "pitufo")) {
            System.out.printf("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            pitufo=escaner.nextLine();
            if (pitufo.equals( "aceite")) {
                precio=1.20f;
            } else {
                precio=1.60f;
            }
        }

        System.out.printf("¿Qué ha tomado de beber? (zumo o café): ");
        bebida=escaner.nextLine();

        if (bebida.equals( "zumo")) {
            precioBebida=1.50f;
        } else if (bebida.equals( "cafe")) {
            precioBebida=1.20f;
        }

        precioTotal=precio+precioBebida;

        System.out.printf("\n%s: %.2f€",comida, precio);
        System.out.printf("\n%s: %.2f€", bebida, precioBebida);
        System.out.printf("\nTotal desayuno:  %.2f€", precioTotal);
    }
}
