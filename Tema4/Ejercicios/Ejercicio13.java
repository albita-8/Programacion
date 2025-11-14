import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int numero;
        char caracter;

        Scanner escaner = new Scanner(System.in) ;

        System.out.println("Este programa pinta una pirámide.");
        System.out.printf("Introduzca el carácter de relleno: ");
        caracter=escaner.next().charAt(0);

        System.out.println("Elija un tipo de pirámide:");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        numero=escaner.nextInt();

        System.out.println("La pirámide es: ");
        switch (numero) {
            case 1: 
                System.out.printf("    %s\n", caracter);
                System.out.printf("   %s%s%s\n", caracter, caracter, caracter);
                System.out.printf("  %s%s%s%s%s\t\n", caracter, caracter, caracter, caracter, caracter);
                break;
            case 2:
                System.out.printf("  %s%s%s%s%s\n", caracter, caracter, caracter, caracter, caracter);
                System.out.printf("   %s%s%s\n", caracter, caracter, caracter);
                System.out.printf("    %s\n", caracter);
                break ;
            case 3:
                System.out.printf("\t%s\n", caracter);
                System.out.printf("\t%s%s%s\n", caracter, caracter, caracter);
                System.out.printf("\t%s%s%s%s%s\n", caracter, caracter, caracter, caracter, caracter);
                System.out.printf("\t%s%s%s\n", caracter, caracter, caracter);
                System.out.printf("\t%s\n", caracter);
                break;
            case 4:
                System.out.printf("%s\t\n", caracter);
                System.out.printf("%s%s%s\t\n", caracter, caracter, caracter);
                System.out.printf("%s%s%s%s%s\t\n", caracter, caracter, caracter, caracter, caracter);
                System.out.printf("%s%s%s\t\n", caracter, caracter, caracter);
                System.out.printf("%s\t\n", caracter);
                break;
        }

        escaner.close();
    }
}
