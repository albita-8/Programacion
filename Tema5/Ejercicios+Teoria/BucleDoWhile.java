import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        int numero;
        int total = 0;
        int suma=0;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduzca números y pulse ENTER. Para acabar, introduce un número negativo.");
         
        do {
            
            System.out.print("?");
            numero=escaner.nextInt();

            if(numero>=0) {
                suma += numero;       //suma = suma + numero
                total=total+1 ;
            }
        } while (numero>=0) ;

        System.out.printf("Se han introducido \033[1m%d\033[0m numeros en total y la suma de todos ellos es \033[1m%d\033[0m", total, suma);

        escaner.close();
    }
}