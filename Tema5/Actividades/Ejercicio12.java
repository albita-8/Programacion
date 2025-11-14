import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int base;
        int exponente;
        int solucion=1;
        int contador=0;

        Scanner escaner = new Scanner(System.in);

        System.out.printf("Introduzca la base: ");
        base=escaner.nextInt();

        System.out.printf("Introduzca el exponente máximo: ");
        exponente=escaner.nextInt();

        do {
            solucion*=base;
            System.out.println(base+"^"+exponente+"="+solucion);
            contador++;
        } while (contador<exponente);

        escaner.close();
    }
}
