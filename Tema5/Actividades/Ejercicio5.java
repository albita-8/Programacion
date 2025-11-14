
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero;
        int clave;
        int multiplicacion;

        Scanner escaner = new Scanner (System.in);
        
        System.out.printf("Introduce un numero y te mostraré su table de multiplicar: ");
        clave=escaner.nextInt();


        for (numero=0; numero<=10; numero++) {
            multiplicacion=clave*numero;
        System.out.println(+clave+" x "+numero+" = "+multiplicacion);
}
        escaner.close();
    }
}
