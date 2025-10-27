public class Ejercicio5 {
    public static void main(String[] args) {
        float numero1 ;
        float numero2 ;
        float resultado ;
        String linea ;

            System.out.println("Introduce la altura del rectangulo: ");
            linea = System.console().readLine() ;
            numero1 = Float.parseFloat(linea) ;
            System.out.println("Introduce la base del rectangulo: ") ;
            linea = System.console().readLine() ;
            numero2 = Float.parseFloat(linea) ;
            resultado = numero1 * numero2 ;
            System.out.println("El area del rectangulo es: " + resultado) ;
    }
    
}
