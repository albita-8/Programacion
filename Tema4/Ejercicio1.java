import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    
        String dia;


        Scanner escaner = new Scanner(System.in) ;

        System.out.println("Introduce un día de la semana y te dire qué asignatura toca a primera hora de ese dia: ");
        dia = escaner.nextLine() ;

        switch (dia) {
            case "lunes": System.out.println("PROGRAMACION");
                break;
            case "martes": System.out.println("COMPUTER SYSTEMS");
                break;
            case "miercoles": System.out.println("BASE DE DATOS");
                break;
            case "jueves": System.out.println("COMPUTER SYSTEMS");
                break;
            case "viernes": System.out.println("PROGRAMACION");
                break;
            default: System.out.println("El día introducido es incorrecto");
        }
    }
}
