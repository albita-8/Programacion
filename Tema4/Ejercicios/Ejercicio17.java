import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        int numero;
        int contador=0;

        Scanner escaner = new Scanner(System.in) ;

            System.out.print("Introduce un numero entero (de 5 cifras como máximo): ");
            numero=escaner.nextInt();

        if (numero == 0) {
            contador = 1; // El número 0 tiene un dígito
        } else {
            while (numero > 0) {
                numero = numero / 10;
                contador++;
            }
        }

        System.out.printf("El numero introducido tiene %d digitos. \n", contador);

        escaner.close();
    }
}
