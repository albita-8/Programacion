import java.util.Scanner;

public class EjercicioFor {
    public static void main(String[] args) {
        int edad;
        int numero;

        Scanner escaner = new Scanner(System.in);
        
        System.out.printf("Introduce tu edad: ");
        edad=escaner.nextInt();

        for (numero=1; edad>=numero; numero++) {
            System.out.println(numero);
}
escaner.close();
    }
}
