import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int numero=0;
        int contador;
        int solucion=0;

        Scanner escaner = new Scanner(System.in);

        System.out.printf("Introduce un número entero positivo: ");
        numero=escaner.nextInt();

        if (numero<0) {
            System.out.println("Número introducido incorrecto, debe introducir un número positivo.");
        } else {
            for (contador=1; contador<=100; contador++) {
            solucion+=numero+contador;
            }
        }

        System.out.println("La suma de los 100 números siguientes a "+numero+" es "+solucion);


        escaner.close();
    }
}
