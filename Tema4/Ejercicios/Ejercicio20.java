import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
            String diaSemana;
            int dia=0;
            int hora;
            int minutos;
            int tiempoTotal;
            int tiempoActual;
        
        Scanner escaner = new Scanner(System.in);

        System.out.printf("Introduzca un día de la semana (de lunes a viernes): ");
        diaSemana=escaner.nextLine().toLowerCase();

        System.out.println("A continuación introduzca la hora (hora y minutos): ");
        System.out.printf("Hora: ");
        hora=escaner.nextInt();

        System.out.printf("Minutos: ");
        minutos=escaner.nextInt();

        switch(diaSemana) {
            case "lunes": 
                    dia=0 ;
                    break;
            case "martes":
                    dia=1 ;
                    break;
            case "miercoles":
                    dia=2 ;
                    break;
            case "jueves":
                    dia=3 ;
                    break;
            //el fin de semana empieza el viernes a la 15:00
            case "viernes":
                    dia=4 ;
                    break;
            default:
                System.out.println("El día introducido no es correcto");
        }

        tiempoTotal=(4*24*60)+(15*60) ;
        tiempoActual= (dia *24 *60)+ (hora*60) + minutos ;

        System.out.printf("Faltan %d minutos para el fin de semana", tiempoTotal - tiempoActual);

        escaner.close();

    }
}


//escribir en consola javac ./ejercicio.java para compilarlo
