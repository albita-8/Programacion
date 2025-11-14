import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int contador;
        int solucion;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        numero1=escaner.nextInt();

        System.out.println("Introduzca otro número distinto al anterior: ");
        numero2=escaner.nextInt();

        if (numero1<0 || numero2<0) {
            System.out.println("Números no válidos, deben ser distintos.");
        } else {
            for (contador=1; numero2<numero1; contador++) {
                solucion=numero1+7;
                System.out.println(solucion);
            }
        }
escaner.close();
    }
}
