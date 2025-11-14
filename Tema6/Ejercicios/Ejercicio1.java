public class Ejercicio1 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int suma;

        System.out.printf("Tirada de tres dados: ");
        numero1=(int) (Math.random() *10) + 1;
        System.out.printf("%d\t", numero1);
        numero2=(int) (Math.random() *10) + 1;
        System.out.printf("%d\t", numero2);
        numero3=(int) (Math.random() *10) + 1;
        System.out.printf("%d\t", numero3);

        suma=numero1+numero2+numero3;
        System.out.printf("\nSuma total: %d", suma);
    }
}