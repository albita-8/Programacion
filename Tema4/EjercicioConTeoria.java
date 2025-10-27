import java.util.Scanner;

public class EjercicioConTeoria {
    public static void main(String[] args) {
        
        float resultado;
        String mensaje ;

        Scanner escaner = new Scanner(System.in);
        System.out.print("¿Que nota has sacado en el ultimo examen?  ");
        resultado = escaner.nextFloat();
     
        //Operacion relacional

//condicion
if (resultado >=0) {
    if (resultado <=10)
//desarrollo
if (resultado>=5) {
    System.out.println("¡Enhorabuena! ¡Has aprobado!") ;
} 
else {
    System.out.println("Lo siento :( Has suspendido") ; }

else {
    System.out.print("Solo recojo resultados del 0 al 10") ;
}

//Operacion ternario
mensaje = (resultado >= 5) ? "¡Enhorabuena! ¡Has aprobado!" : "Lo siento :( Has suspendido";
System.out.println(mensaje);

 }

    }
 }









