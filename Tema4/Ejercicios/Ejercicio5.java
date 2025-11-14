import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final float GRAVEDAD = 9.81f ;    //constante
        float altura ;
        float operacion ;

        Scanner escaner = new Scanner(System.in) ;

        System.out.println("Calculo del tiempo de caida de un objeto");
        System.out.printf("Introduce la altura (en metros) desde la que cae el objeto: ");
        altura = escaner.nextFloat() ;

        operacion = (float) Math.sqrt((2*altura)/GRAVEDAD); //para cambiar de double a float

        System.out.printf("El objeto tarda %.2f segundos.", operacion);

        escaner.close();
    }
}
