import java.util.Scanner;

public class EjerciciosLogicos {
    public static void main(String[] args) {
        int resultado ;

//segundo ejercicio de operaciones logicas
    Scanner escaner = new Scanner(System.in);
        System.out.printf("Introduce un valor comprendido entre 1 y 100: ") ;
        resultado = escaner.nextInt();

    if ((resultado> 1) && (resultado < 100)) {
        System.out.printf("¡Enhorabuena! ¡El valor introducido enstá en el rango indicado!") ;
     } else {
        System.out.printf( "¡Te he dicho un valor entre 1 y 100!");
     }

//forma simplificada (operacion logica)

        if (resultado>= 0 && resultado <= 10) {
           System.out.print((resultado >= 5) ? "¡Enhorabuena! ¡Has aprobado!" : "Lo siento :( Has suspendido") ;
            }
            else {
            System.out.print("Solo recojo resultados del 0 al 10");
            }
        
    }
 }

