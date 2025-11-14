public class Ejercicio26 {
    public static void main(String[] args) {
        int jugador1;
        int jugador2;

        System.out.printf("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        jugador1=(int)(Math.random()*3-1+1)+1;

        switch (jugador1) {
            case 1:
                System.out.printf("Piedra");
                break;
            case 2:
                System.out.printf("Papel");
                break;
            case 3:
                System.out.printf("Tijeras");
                break;
            default:
                System.out.printf("\nIntroduce la informacion correcta");
                break;
        }

        System.out.printf("\nTurno del jugador 2 (introduzca piedra, papel o tijera): ");
        jugador2=(int)(Math.random()*3-1+1)+1;

        switch (jugador2) {
            case 1:
                System.out.printf("Piedra");
                break;
            case 2:
                System.out.printf("Papel");
                break;
            case 3:
                System.out.printf("Tijeras");
                break;
            default:
                System.out.printf("\nIntroduce la informacion correcta");
                break;
        }

        if (jugador1==jugador2) {
            System.out.println("\nEmpate");
        } else if (jugador1==1 && jugador2==2) {
            System.out.println("\nGana el jugador 2");
        } else if (jugador1==2 && jugador2==1) {
            System.out.println("\nGana el jugador 1");
        } else if (jugador1==3 && jugador2==1) {
            System.out.println("\nGana el jugador 2");
        } else if (jugador1==3 && jugador2==2) {
            System.out.println("\nGana el jugador 1");
        } else if (jugador1==1 && jugador2==3) {
            System.out.println("\nGana el jugador 1");
        } else if (jugador1==2 && jugador2==3) {
            System.out.println("\nGana el jugador 2");
        }
    }
}
