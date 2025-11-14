public class Ejercicio25 {
    public static void main(String[] args) {
        long numero ;
        long factorial = 1;
        long contador=0;
        
        System.out.printf("Introduzca un numero entero: ");
        numero=Integer.parseInt(System.console().readLine()) ;

        //hacia alante

        if ((numero==0) || (numero==1)) {
            factorial = 1;
        } else {
            for (contador=1; contador<=numero; contador ++) {
                factorial *= contador;
            }
        }

        //hacia atras
        while (factorial > 1) {
            factorial=factorial*contador;
            contador --;
        }

        System.out.printf("%d! = %d\n", numero, factorial);
    }
}
