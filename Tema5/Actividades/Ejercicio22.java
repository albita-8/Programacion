public class Ejercicio22 {
    public static void main(String[] args) {
        
        int numero;
        int temporal=0;
        int resultado=0;

        System.out.print("Introduzca un número entero: ");
        numero = Integer.parseInt(System.console().readLine());

        temporal=numero;

        while (temporal>0) {
            resultado=(resultado*10)+temporal%10;
            temporal/=10 ;
        }
        System.out.printf("Si le damos la vuelta a %d tenemos el %d\n", numero, resultado);
    }
}
