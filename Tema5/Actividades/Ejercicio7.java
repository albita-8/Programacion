
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;
        int suma=0;
        int contador=0;
        float media;

        Scanner escaner = new Scanner (System.in);
        
        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números: ");
        numero=escaner.nextInt();

        do {
            numero = escaner.nextInt();

            if (numero >= 0) {
                suma += numero;
                contador++;
            }

        } while (numero >= 0);

        if (contador > 0) {
            media = suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números válidos.");
        }

        escaner.close();
    }
}
