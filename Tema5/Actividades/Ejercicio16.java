import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int altura;
        int caracter;
        int fila;
        int espacio;
        int simbolo;

        Scanner escaner = new Scanner(System.in);

        System.out.printf("Introduce la altura de la piramide: ");
        altura=escaner.nextInt();

        System.out.printf("Introduce el carácter de relleno: ");
        caracter=escaner.next().charAt(0);

            for (fila = 1; fila <= altura; fila++) {

            for (espacio = 1; espacio <= altura - fila; espacio++) {
                System.out.print(" ");
            }

            for (simbolo = 1; simbolo <= (2 * fila - 1); simbolo++) {
                System.out.printf("%c",caracter);
            }

            System.out.println();
        }

        escaner.close();
    }
}
