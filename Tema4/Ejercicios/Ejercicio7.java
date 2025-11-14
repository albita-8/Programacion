import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        float nota1 ;
        float nota2 ;
        float nota3 ;
        float media ;

        Scanner escaner = new Scanner(System.in).useLocale(Locale.ENGLISH) ;

        System.out.printf("Introduzca la primera nota: ");
        nota1 = escaner.nextFloat(); 

        System.out.printf("Ahora introduzca la segunda nota: ");
        nota2 = escaner.nextFloat();

        System.out.printf("Por ultimo introduzca la tercera nota: ");
        nota3 = escaner.nextFloat();

        media = (nota1 + nota2 + nota3) /3 ;

        System.out.printf("La media es de %.2f\n", media);
        
        if (media < 5) {
            System.out.println("Insuficiente");
        } else if (media < 6) {
            System.out.println("Suficiente");
        } else if (media < 7) {
            System.out.println("Bien");
        } else if (media < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
        escaner.close();
    }
}
