import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
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

        System.out.printf("La media es de %.2f", media);
        
        escaner.close();
    }
}
