import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero;
        int negativo=0;
        int contador;
        int positivo=0;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce 10 números enteros: ");

        for (contador=1;contador<=10; contador++) {

        numero=escaner.nextInt();

        if (numero<0) {
            negativo++;
        } else {
            positivo++;
        }
    }
        System.out.println("Has introducido "+positivo+" positivos y "+negativo+" negativos");

        escaner.close();
    }
}
