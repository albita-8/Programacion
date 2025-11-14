import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        int altura;
        int fila;
        int col;

        Scanner escaner = new Scanner(System.in);

        System.out.printf("Introduce la altura de la piramide: ");
        altura=escaner.nextInt();

        for (fila = 1; fila <= altura; fila++) {

            for (col = 1; col <= altura - fila; col++) {
                System.out.print(" ");
            }

            for (col = 1; col <= fila; col++) {
                System.out.print(col);
            }

            for (col=fila-1; col > 0; col--) {
                System.out.print(col);
            }
            System.out.println("");
        
        }

        escaner.close();
    }
}
