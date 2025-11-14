public class Moneda {
    public static void main(String[] args) {
        
        //simulamos la tirada de una moneda: [0, 1)
        int num = (int) (Math.random() * 2) ;

        if (num==0) {
            System.out.println("CARA");
    } else {
        System.out.println("CRUZ");
    }
}
}