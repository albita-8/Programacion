public class Ejercicio9 {
    public static void main(String[] args) {
        int numero;
        int act=0;
        int ant=1;
        int temporal;
        
        System.out.println("\033[1mN PRIMEROS TÉRMINOS DE LA SERIE DE FIBONACCI\033[0m");
        System.out.printf("Introduzca un número: ");
        numero=Integer.parseInt(System.console().readLine()) ;

        while (numero >= 1) {
            
            

            temporal = ant + act;
            ant = act;
            act=temporal;

            numero-- ;
            
            System.out.println(ant + " ");
        }

    }
}
