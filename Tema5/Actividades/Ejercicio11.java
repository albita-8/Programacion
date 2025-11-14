import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int base;
        int exponente;
        int solucion=1;
        int contador=0;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Cálculo de una potencia");
        System.out.printf("Introduzca la base: ");
        base=escaner.nextInt();

        System.out.printf("Introduzca el exponente: ");
        exponente=escaner.nextInt();

        do {
        solucion*=base;
        contador++;
        } while (contador<exponente);

        System.out.println(base+"^"+exponente+"="+solucion);

        escaner.close();
    }
}


