import java.util.Locale;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
            float a ;
            float b ;
            float c ;
            float discriminante;
            float raiz;
            
            Scanner escaner = new Scanner (System.in).useLocale(Locale.ENGLISH) ;

            System.out.printf("El programa resuelve ecuaciones de segundo grado del tipo ax² + bx + c = 0\n");
            System.out.printf("Introduzca el valor de a: ");
            a=escaner.nextFloat() ;
    
            System.out.printf("Ahora introduzca el valor de b: ");
            b=escaner.nextFloat() ;

            System.out.printf("Por ultimo introduzca el valor de c: ");
            c=escaner.nextFloat() ;
    
            if (a == 0) {
                System.out.printf("La ecuacion no tiene solucion.");
            } else {

                discriminante = (float) (Math.pow(b, 2) - 4 * a * c) ;  //(Math.pow) calcula la potencia de un numero

                if (discriminante<0) {
                    System.out.println("La ecuacion tiene infinitas soluciones");
                } else {
                    raiz= (float) Math.sqrt(discriminante) ;
                    System.out.printf("x1 = %.2f \n", -b + (raiz/2*a)) ;
                    System.out.printf("x2 = %.2f \n", -b - (raiz/2*a)) ;
                }
            
        }

        escaner.close() ;    //para cerrar el escaner
    }

}
