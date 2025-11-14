import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int numero;
        String parImpar;
        String divisible;
        
        Scanner escaner = new Scanner(System.in) ;

        System.out.printf("Introduce un número entero: ");
        numero=escaner.nextInt();

        if (numero%2==0) {
            parImpar = "par";
        } else {
            parImpar = "impar";
        }

        //o

        //parImpar = (numero%2==0)?"par":"impar";

        if (numero%5==0) {;
            divisible = "divisible";
        } else {
            divisible = "no es divisible";
    }
    System.out.printf("El numero introducido es %s y %s entre 5.", parImpar, divisible);
    escaner.close();
}
}
