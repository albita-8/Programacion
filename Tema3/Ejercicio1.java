public class Ejercicio1 {
    public static void main(String[] args) {
        int numero1 ;
        int numero2 ;
        int resultado ;
        String linea ;

            System.out.println("Introduce un numero: ");
            linea = System.console().readLine() ;
            numero1 = Integer.parseInt(linea) ;
            System.out.println("Introduce otro numero: ") ;
            linea = System.console().readLine() ;
            numero2 = Integer.parseInt(linea) ;
            resultado = numero1 * numero2 ;
            System.out.println("El resultado es: " + resultado) ;
    }
} 


