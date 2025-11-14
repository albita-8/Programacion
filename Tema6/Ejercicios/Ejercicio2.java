public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroCarta;
        int palo ;
        String valor ;
        String nombrePalo="";

        numeroCarta= (int) (Math.random() * 13) + 1;
        palo= (int) (Math.random() * 4) + 1;

        if (numeroCarta == 1) {
            valor = "A";
        } else if (numeroCarta == 11) {
            valor = "J";
        } else if (numeroCarta == 12) {
            valor = "Q";
        } else if (numeroCarta == 13) {
            valor = "K";
        } else {
            valor = "" + numeroCarta;
        }


        switch (palo) {
            case 1:
                nombrePalo = "corazones";
                break;
            case 2:
                nombrePalo = "picas";
                break;
            case 3:
                nombrePalo = "tréboles";
                break;
            case 4:
                nombrePalo = "diamantes";
                break;
        }

        System.out.println(" " + valor + " de " + nombrePalo);
    }
}

