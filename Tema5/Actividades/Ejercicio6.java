
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero;
        int digito=1;
        int temporal;

        Scanner escaner = new Scanner(System.in);
        
        System.out.printf("Introduzca un numero entero: ");
        numero=escaner.nextInt();

        temporal = Math.abs(numero) ;

        while (numero >= 10) {
            numero /= 10;
            digito++;
        }

        System.out.println("El número " + temporal + " tiene " + digito + " dígito(s).");
        escaner.close();
    }
}
