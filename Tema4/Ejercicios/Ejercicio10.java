import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int hora;
        int minutos;
        int segundos;


        Scanner escaner = new Scanner(System.in) ;

        System.out.printf("Introduce la hora: ");
        hora=escaner.nextInt();

        System.out.printf("Introduce los minutos: ");
        minutos=escaner.nextInt();

        segundos= ((24-hora)*3600) - minutos*60 ;

        System.out.println("Desde las " + hora +":"+ minutos +" hasta la medianoche faltan " + segundos + " segundos");

        escaner.close();
    }
}
