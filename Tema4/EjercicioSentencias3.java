import java.util.Scanner;

public class EjercicioSentencias3 {
    public static void main(String[] args) {
        
        int numero;
        float lado;
        float area1;
        float area2;
        float area3;
        float altura1;
        float altura2;
        float base1;
        float base2;

        Scanner escaner = new Scanner(System.in) ;

        System.out.println("Introduzca el numero 1 si desea que calcule el area de un cuadrado");
        System.out.println("Introduzca el numero 2 si desea que calcule el area de un rectangulo");
        System.out.println("Introduzca el numero 3 si desea que calcule el area de un triangulo");
        System.out.println("Introduce un numero: ");
        numero=escaner.nextInt();

        switch (numero) {
            case 1: 
            System.out.println("Introduce el valor del lado: ");
            lado=escaner.nextFloat() ;
            area1=lado*lado ;
            System.out.printf("El area del cuadrado es %.3f \n", area1);
                break;
            case 2: 
            System.out.println("Introduce el valor de la altura:");
            altura1=escaner.nextFloat();
            System.out.println("Introduce el valor de la base:");
            base1=escaner.nextFloat();
            area2=altura1*base1 ;
            System.out.printf("El area del rectangulo es %.3f \n", area2);
                break;
             case 3: 
             System.out.println("Introduce el valor de la altura:");
             altura2=escaner.nextFloat();
             System.out.println("Introduce el valor de la base:");
             base2=escaner.nextFloat();
             area3=(altura2*base2)/2 ;
             System.out.printf("El area del cuadrado es %.3f \n", area3);
        
         }
    }
}
