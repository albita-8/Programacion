import java.util.Locale;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        float base;
        String IVA;
        String codigo;
        float operacion = 0;
        float total = 0;
        float descuento = 0;
        
        Scanner escaner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        try {
        System.out.printf("Introduzca la base imponible: ");
        base=Integer.parseInt(System.console().readLine());

        System.out.printf("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        IVA=escaner.nextLine();

        System.out.printf("Introduzca el código promocional(nopro, mitad, meno5 o 5porc): ");
        codigo=escaner.nextLine();

        System.out.printf("Base imponible:         %.2f \n", base);
        
        switch (IVA) {
            case "general" : 
                operacion=base*0.21f;
                total=base+operacion;
                System.out.printf("IVA (%s%%):         %.2f\n", IVA, operacion);
                System.out.printf("Precio con IVA:         %.2f\n", total);
                    break;
            case "reducido" :
                operacion=base*0.1f;
                total=base+operacion;
                System.out.printf("IVA (%s%%):         %.2f\n", IVA, operacion);
                System.out.printf("Precio con IVA:         %.2f\n", total);
                    break;
            case "superreducido" :
                operacion=base*0.04f;
                total=base+operacion;
                System.out.printf("IVA (%s%%):         %.2f\n", IVA, operacion);
                System.out.printf("Precio con IVA:         %.2f\n", total);
                    break;
        }

      switch (codigo) {
            case "nopro":
                descuento = 0;
                break;
            case "mitad":
                descuento = total / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = total * 0.05f;
                break;
            default:
                System.out.println("Código promocional no válido.");
                return;
        }

        System.out.printf("Cod. promo. (%s):   -%.2f\n", codigo, descuento);
        System.out.printf("Total final:            %.2f\n", total - descuento);
         }
         catch(Exception excepcion) {
            System.out.println("Respuesta no válida.");
         }
         escaner.close() ;
    }

}
