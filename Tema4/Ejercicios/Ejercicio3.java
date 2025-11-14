import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        float horas ;
        float resultado ;

        Scanner escaner = new Scanner(System.in);

        System.out.printf("Introduzca el numero de horas trabajadas durante la semana: ") ;
        horas=escaner.nextFloat() ;

        if (horas<40) {
            resultado = horas * 12 ;
        } else {
            resultado=horas * 16 ;
        }


        System.out.printf("El sueldo semanal que le corresponde es de %.0f euros", resultado);
        escaner.close();
    }
    
}
