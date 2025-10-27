import java.util.Scanner;

public class Condiciones {
    public static void main(String[] args) {
        
        int edad;

        Scanner escaner = new Scanner(System.in) ;

        System.out.println("Introduce tu edad: ");
        edad=escaner.nextInt() ;

        if (edad >=18) {
            System.out.println("Eres mayor de edad");
            if (edad > 65){
                System.out.println("Estas jubilado/a");
            } else {
            System.out.println("Estas en activo");
            }
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
