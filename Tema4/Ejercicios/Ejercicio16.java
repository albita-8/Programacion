import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        
        int numero;
    
        Scanner escaner = new Scanner(System.in) ;
            System.out.print("Introduce un numero entero (de 5 cifras como máximo): ");
            
            numero=escaner.next().charAt(0);

            System.out.printf("El primer digito del numero introducido es el %c. \n", numero);

            escaner.close();
        }
    }