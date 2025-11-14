
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero=0;
        int intento=4;
        final int clave = 1523 ;
        boolean abierta = false;

        Scanner escaner = new Scanner(System.in);

            do {
                System.out.printf("Introduce la clave de la caja fuerte: ");
                numero=escaner.nextInt();
                intento--;

                abierta = (clave==numero);

                if (!abierta) {
                    System.out.println("Clave incorrecta");
                }

              /*   if (numero != clave) {
                    abierta=true;
                } else {
                System.out.println("Clave incorrecta");
                }           */
                
            } while ((intento>0) && (!abierta)) ;
        

            if (abierta){
                System.out.println("Ha abierto la caja fuerte!");
            } else {
                System.out.println("Lo siento ha agotado los intentos");
                System.out.println("Se ha emitido un aviso a la policia");
            }

        escaner.close();
    }
}
