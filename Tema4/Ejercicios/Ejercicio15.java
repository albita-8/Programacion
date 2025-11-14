public class Ejercicio15 {
    public static void main(String[] args) {
        
    int numero;
    int digito;

        System.out.print("Introduce un numero entero: ");
        numero = Integer.parseInt(System.console().readLine()) ;

        digito=numero%10;
        if (digito < 0) {
            digito=Math.abs(digito) ;   //(Math.abs) valor absoluto del numero
        }
        System.out.printf("El ultimo digito del numero introducido es el %d. \n", digito);
    }
}
