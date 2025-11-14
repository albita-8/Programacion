import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int numero;
        boolean primo = false;
        int i = 2;

        Scanner escaner = new Scanner(System.in);

        System.out.printf("Introduzca un número entero: ");
        numero=escaner.nextInt();

        while ((i < (numero/2)) && (!primo)) {
            primo = numero%i==0 ;
            i ++;
        }

        if (primo) {
            System.out.println("El número NO es primo.");
        } else {
            System.out.println("El número es primo.");
        }

        escaner.close();
    }
}