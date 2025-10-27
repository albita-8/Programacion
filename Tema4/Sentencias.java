import java.util.Scanner;

public class Sentencias {
    public static void main(String[] args) {
        
        int opcion;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Encuesta de satisfaccion con el servicio ofrecido: ");
        System.out.println("1. Insatisfecho");
        System.out.println("2. Satisfecho");
        System.out.println("3. Muy satisfecho");

        System.out.println("\n Introduce tu opcion (1-3):");
        opcion = escaner.nextInt();

        if (opcion == 1) {
            System.out.println("Lamentamos que no este satisfecho. ¡Trabajaremos para mejorar!");
        } else if (opcion == 2) {
            System.out.println("Gracias por su opinion. ¡Nos alegra que este satisfecho!");
        } else if (opcion == 3) {
            System.out.println("¡Excelente! Nos alegra mucho uqe este satisfecho");
        } else {
            System.out.println("Opcion no correcta");
        }


//Otra forma (sentencias de seleccion)
        switch(opcion) {
            case 1: System.out.println("Lamentamos que no este satisfecho. ¡Trabajaremos para mejorar!");
                break ;
            case 2: System.out.println("Gracias por su opinion. ¡Nos alegra que este satisfecho!");
                break ;
            case 3: System.out.println("¡Excelente! Nos alegra mucho uqe este satisfecho");
            default: System.out.println("Opcion no correcta");
        }
    }
}
