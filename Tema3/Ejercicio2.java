public class Ejercicio2 {
    public static void main(String[] args) {
        String linea ;
        float resultado ;
        float numero ;
        float peseta ;
peseta = 166.386f ;
        System.out.println("Introduzca la cantidad de euros que quiera convertir: ") ;
        linea = System.console().readLine() ;
        numero = Float.parseFloat(linea) ;
        resultado = numero * peseta ;
        System.out.println("La conversión es: " + resultado) ;
    }
}
