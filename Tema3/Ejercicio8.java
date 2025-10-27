public class Ejercicio8 {
    public static void main(String[] args) {
        float numero ; 
        float resultado ;
        String linea ;

            System.out.println("Introduce las horas trabajadas a la semana: ");
            linea = System.console().readLine() ;
            numero = Float.parseFloat(linea) ;
            resultado = numero * 12 ;
            System.out.println("Su salario semanal es: " + resultado) ;
    }
}
