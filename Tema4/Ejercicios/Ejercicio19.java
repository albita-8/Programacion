import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float operacion;
        String resultado;

        Scanner escaner = new Scanner(System.in);

        System.out.printf("Nota del primer examen: ");
        nota1=escaner.nextFloat();

        System.out.printf("Nota del segundo examen: ");
        nota2=escaner.nextFloat();

        escaner.nextLine();              //para limpiar el buffer

        if (nota1>=5 && nota2>=5) {
            operacion=(nota1+nota2)/2 ;
            System.out.printf("Tu nota en programación es %.2f", operacion);
        } else {
            System.out.printf("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            resultado=escaner.nextLine().toLowerCase();     //para que acepte minusculas  .toLowerCase
        if (resultado.equals("apto")) {    //con string no se puede poner ==, hay que poner o .equals
                System.out.println("Tu nota en programación es 5.00");
            } else {
                operacion = (nota1 + nota2) / 2;
                System.out.printf("Tu nota en programación es %.2f", operacion);
                }
        escaner.close() ;
    }
}
}