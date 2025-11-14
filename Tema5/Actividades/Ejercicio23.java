public class Ejercicio23 {
    public static void main(String[] args) {
        int numero;
        int digito;
        int volteado=0;
        int posicion=1;

        try {
        System.out.print("Introduzca un número entero: ");
        numero = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca un dígito: ");
        digito = Integer.parseInt(System.console().readLine());

        System.out.printf("Contando de izquierda a derecha, el %d aparece dentro de las siguientes posiciones: ", digito, numero);

        while (numero>0) {
            volteado=(volteado*10) + (numero%10);
            numero/=10;
        }

        while (volteado>0) {
            if (volteado%10==digito) {
                System.out.printf("%d", posicion);
        }

        volteado /=10;
        posicion++;
    }

    } catch (Exception excepcion) {
        System.out.println("** ERROR: Debes introducir un valor numérico");
        System.out.println(excepcion.getMessage());
        System.out.println(excepcion.getClass());
    }
    }
}