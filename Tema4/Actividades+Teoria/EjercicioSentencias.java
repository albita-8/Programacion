import java.util.Scanner;

public class EjercicioSentencias {
    public static void main(String[] args) {
        
        int dia ;

        System.out.println("Días de la semana: ");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");


        Scanner escaner = new Scanner(System.in);
        
        System.out.printf("Introduce el dia de la semana: ");
        dia = escaner.nextInt() ;

        switch (dia) {
            case 1: System.out.println("Es un dia entre semana");
                break;
            case 2: System.out.println("Es un dia entre semana");
                break;
             case 3: System.out.println("Es un dia entre semana");
                break;
            case 4: System.out.println("Es un dia entre semana");
                break;
            case 5: System.out.println("Es un dia entre semana");
                break;
            case 6: System.out.println("Es fin de semana");
                break;
            case 7: System.out.println("Es fin de semana");
                break;
            default: System.out.println("No se corresponde con ningun dia de la semana");
                break;
        }

//ahora con el if
        if ((dia >= 1) && (dia<=5)) {
            System.out.println("Es un dia entre semana");
        } else if ((dia == 6) || (dia==7)) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("No se corresponde con ningun dia de la semana");
        }
    }
}
