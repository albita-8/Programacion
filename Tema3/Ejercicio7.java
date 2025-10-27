public class Ejercicio7 {
    public static void main(String[] args) {
        float numero ; 
        float resultado ;
        float operacion ;
        String linea ;

            System.out.println("Introduce un precio: ");
            linea = System.console().readLine() ;
            numero = Float.parseFloat(linea) ;
            operacion = numero * 0.21f ;
            resultado = numero + operacion ;
            System.out.println("El resultado es: " + resultado) ;
    }
}
