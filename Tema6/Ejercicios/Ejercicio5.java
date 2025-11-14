public class Ejercicio5 {
    public static void main(String[] args) {
        int i;
        int numero;

        for (i=0; i<50; i++) {
           numero= (int) (Math.random()*100)+100;
           System.out.println(numero + "");
        }
    }
}
