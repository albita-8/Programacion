public class Ejercicio6 {
    public static void main(String[] args) {
        int numeroSecreto;
        int intento;

        numeroSecreto = (int) (Math.random() * 100);

        System.out.println("Estoy pensando en un número del 0 al 100. La máquina intentará adivinarlo. Tiene 5 oportunidades.");

        // Primer intento
        intento = (int) (Math.random() * 100);
        System.out.printf("Introduce un número: %d\n", intento);
        if (intento == numeroSecreto) {
            System.out.println("¡Enhorabuena! ¡Has acertado!");
        } else if (intento < numeroSecreto) {
            System.out.println("El número secreto es mayor.");
        } else {
            System.out.println("El número secreto es menor.");
        }
        System.out.println("Te quedan 4 oportunidades.");

        // Segundo intento
        intento = (int) (Math.random() * 100);
        System.out.printf("Introduce un número: %d\n", intento);
        if (intento == numeroSecreto) {
            System.out.println("¡Enhorabuena! ¡Has acertado!");
        } else if (intento < numeroSecreto) {
            System.out.println("El número secreto es mayor.");
        } else {
            System.out.println("El número secreto es menor.");
        }
        System.out.println("Te quedan 3 oportunidades.");

        // Tercer intento
        intento = (int) (Math.random() * 100);
        System.out.printf("Introduce un número: %d\n", intento);
        if (intento == numeroSecreto) {
            System.out.println("¡Enhorabuena! ¡Has acertado!");
        } else if (intento < numeroSecreto) {
            System.out.println("El número secreto es mayor.");
        } else {
            System.out.println("El número secreto es menor.");
        }
        System.out.println("Te quedan 2 oportunidades.");

        // Cuarto intento
        intento = (int) (Math.random() * 100);
        System.out.printf("Introduce un número: %d\n", intento);
        if (intento == numeroSecreto) {
            System.out.println("¡Enhorabuena! ¡Has acertado!");
        } else if (intento < numeroSecreto) {
            System.out.println("El número secreto es mayor.");
        } else {
            System.out.println("El número secreto es menor.");
        }
        System.out.println("Te quedan 1 oportunidad.");

        // Quinto intento
        intento = (int) (Math.random() * 100);
        System.out.printf("Introduce un número: %d\n", intento);
        if (intento == numeroSecreto) {
            System.out.println("¡Enhorabuena! ¡Has acertado!");
        } else {
            System.out.println("Lo siento, no has acertado. El número era: " + numeroSecreto);
        }
    }
}
