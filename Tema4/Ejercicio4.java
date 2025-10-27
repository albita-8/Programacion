import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        float a ;
        float b ;
        float x;

        
        Scanner escaner = new Scanner (System.in) ;
        System.out.printf("El programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.printf("Introduzca el valor de a: ");
        a=escaner.nextFloat() ;

        System.out.printf("Ahora introduzca el valor de b: ");
        b=escaner.nextFloat() ;

        if (x = 0) {
            System.out.printf("Esta ecuacion no tiene solucion real");
        } else {
        x=(0-b)/a ;
        }

        System.out.printf("x = %f", x) ;
    }
}
