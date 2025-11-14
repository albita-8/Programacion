public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        String valor="";
        int palo;
        String nombrePalo="";

        numero=(int) (Math.random()*(10)) + 1 ;
        palo= (int) (Math.random()*4) + 1;

        if (numero==1) {
            valor="as" ;
        } else if (numero==8) {
            valor="sota" ;
        } else if (numero==9) {
            valor="caballo" ;
        } else if (numero==10) {
            valor="rey";
        } else {
            valor="" + numero;
        }

        switch (palo) {
            case 1:
                nombrePalo="monedas";
                break;
            case 2:
                nombrePalo="copas";
                break;
            case 3:
                nombrePalo="bastos";
                break;
            case 4:
                nombrePalo="espadas";
                break;
        }
        System.out.println(" " + valor + " de " + nombrePalo);
    }
}
