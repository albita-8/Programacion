public class Ejercicio4 {
    public static void main(String[] args) {
        float numero1 ;
        float numero2 ;
        float resultado1 ;
        float resultado2 ;
        float resultado3 ;
        float resultado4 ;
        String linea ;

        System.out.println("Introduce un numero: ");
        linea = System.console().readLine() ;
        numero1 = Float.parseFloat(linea) ;
        System.out.println("Introduce otro numero: ") ;
        linea = System.console().readLine() ;
        numero2 = Float.parseFloat(linea) ;
        resultado1 = numero1 * numero2 ;
        resultado2 = numero1 + numero2 ;
        resultado3 = numero1 - numero2 ;
        resultado4 = numero1 / numero2 ;
        System.out.printf("%.2f * %.2f = %f\n ", numero1, numero2, resultado1) ; 
        System.out.printf("%.2f + %.2f = %f\n ", numero1, numero2, resultado2) ;
        System.out.printf("%.2f - %.2f = %f\n ", numero1, numero2, resultado3) ;
        System.out.printf("%.2f / %.2f = %f\n ", numero1, numero2, resultado4) ;
            
    }


}
