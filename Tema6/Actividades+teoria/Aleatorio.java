public class Aleatorio {

    public static void main(String[] args) {
        double aleatorio;
        int numero ;

        //generamos un numero aleatorio
        aleatorio = Math.random() ;
        System.out.println(aleatorio);

        //generamos un numero aleatorio en el intervalo [0,10) 
        aleatorio = Math.random() * 10 ;
        System.out.println((int) aleatorio);

        //generamos un numero aleatorio en el intervalo [0,10]
        numero= (int) (Math.random() * (10 + 1)) ;
        System.out.println(numero);

        //[min,max) ----> (Math.random() * (max - min) + min)
        //generamos un numero aleatorio en el intervalo [5,10)
        numero= (int) (Math.random() * (10-5) + 5) ;
        System.out.println(numero);

        //[min,max) ----> (Math.random() * (max + 1) + min)
        //generamo un numero aleatorio en el intervalo [5,10]
        numero= (int) ((Math.random() * 6) + 5) ;
        System.out.println(numero);
        
    } 
}