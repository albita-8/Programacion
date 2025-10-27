public class Ejercicio9 {
    public static void main(String[] args) {
        float numero1 ; 
        float numero2 ; 
        float resultado ;
        String linea ;

            System.out.println("Introduce la altura (m): ");
            linea = System.console().readLine() ;
            numero1 = Float.parseFloat(linea) ;
            System.out.println("Introduce el radio de la base (m): ");
            linea = System.console().readLine() ;
            numero2 = Float.parseFloat(linea) ;
            resultado = 1/3 * (3.14159f * (numero1)^2 * numero2) ;
            System.out.println("El volumen del cono es: " + resultado) ;
    }
}
