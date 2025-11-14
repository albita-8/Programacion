// Alba Agüera Cuadra

import java.util.Locale;
import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        // definimos variables que vamos a usar
        int producto;
        int subproducto=0;
        String nombre;
        int cantidad;
        float precio;
        float IVA1=0.04f;
        float IVA2=0.1f;
        float IVA3=0.2f;
        char promocion = 0;
        int descuento=0;
        int sorpresa;
        int prendas;
        float total;

        //definimos el escaner
        Scanner escaner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        //introducimos el mensaje que queremos mostrar por pantalla
        System.out.println("Introduzca el tipo de producto: ");
        System.out.println("1. Alimentación.");
        System.out.println("2. Electrónica");
        System.out.println("3. Farmacia.");
        System.out.println("4. Moda.");
        System.out.printf("Opcion: ");
        producto=escaner.nextInt();

        //mostramos lista de subproductos en caso de que el usuario introduzca la alimentacion
        if (producto==1) {
            System.out.println("\nIntroduzca el tipo de alimento: ");
            System.out.println("1. Huevos");
            System.out.println("2. Leche");
            System.out.println("3. Pan");
            System.out.println("4. Fruta");
            System.out.println("5. Verdura");
            System.out.println("6. Otros");
            System.out.printf("Opcion: ");
            subproducto=escaner.nextInt();
        }

        escaner.nextLine();
        //mostramos que queremos que rellene el usuario
        System.out.printf("\nIntroduzca el nombre del producto: ");
        nombre=escaner.nextLine();

        System.out.printf("Introduzca la cantidad de productos: ");
        cantidad=escaner.nextInt();

        System.out.printf("Introduzca el precio por la unidad del producto: ");
        precio=escaner.nextFloat();

        // en caso de que el usuario halla elegido los productos electrodomesticos le preguntaremos si tiene promocion o no
        if (producto==2) {
            System.out.printf("¿Tiene promoción? (s/n): ");
            promocion=escaner.next().charAt(0);
        } 
        
        // dependiendo del producto que elija el usuario, el IVA cambiara respectivamente
        total=precio*cantidad;

        //generamo el ticket con todos los datos calculados en funcion de los datos introducidos por el usuario
        switch (producto) {
            case 1:
            switch (subproducto) {
                case 1, 2, 3, 4, 5:
                IVA1 = total*IVA1;
                    break;
                case 6:
                IVA2 = total*IVA2;
                 break;
            }
            System.out.println("\n\033[1mFACTURA\033[0m");
            System.out.println("----------------------------------------------");
            System.out.printf("Atrículo\t%s", nombre);
            System.out.printf("\nPrecio\t$%.2f/unidad", precio);
            System.out.printf("\nCantidad\t%d\n", cantidad);
            System.out.println("----------------------------------------------");
            System.out.printf("Total\t$%.2f", total);
            if (subproducto=='6') {
                System.out.printf("\nIVA al 10%%\t%.2f", precio*IVA2);
            } else {
                System.out.printf("\nIVA al 4%%\t$%.2f", precio*IVA1);
            }
            System.out.printf("\n----------------------------------------------");
            System.out.printf("\nTotal con IVA\t$%.2f", total+precio*IVA1,precio*IVA2);
            System.out.printf("\n\033[1m Producto sorpresa\033[0m\n");
                    break;
            case 2:
            // en caso de que el usuario haya indicado que el producto tiene promiocion generaremos un descuento aleatorio entre el 25% o  el 10%
            if (promocion=='s') {
                descuento= (int) (Math.random()*16)+10;
            }
                System.out.println("\n\033[1mFACTURA\033[0m");
                System.out.println("----------------------------------------------");
                System.out.printf("Atrículo\t%s", nombre);
                System.out.printf("\nPrecio\t$%.2f/unidad", precio);
                System.out.printf("\nCantidad\t%d\n", cantidad);
                System.out.println("----------------------------------------------");
                if (descuento=='s') {
                    System.out.printf("Subtotal\t$%.2f", total);
                    System.out.printf("\nDescuento %d%%\t$-%.2f", descuento, (descuento*total)/100);
                    System.out.printf("\nTotal tras desc.\t$%.2f", total-((descuento*total)/100));
                } else {
                    System.out.printf("\nTotal \t$%.2f", total-((descuento*total)/100));
                    System.out.printf("\nIVA al %.0f%%\t$%.2f",IVA3*100, IVA3*((descuento*total)/100));
                }
                System.out.printf("\n----------------------------------------------");
                System.out.printf("\nTotal con IVA\t$%.2f", (total-((descuento*total)/100))+(IVA3*total-((descuento*total)/100)));
                System.out.printf("\n\033[1m Producto sorpresa\033[0m\n");
                break;
            
            case 3:
                System.out.println("\n\033[1mFACTURA\033[0m");
                System.out.println("----------------------------------------------");
                System.out.printf("Atrículo\t%s", nombre);
                System.out.printf("\nPrecio\t$%.2f/unidad", precio);
                System.out.printf("\nCantidad\t%d\n", cantidad);
                System.out.println("----------------------------------------------");
                System.out.printf("Total\t$%.2f", total);
                System.out.printf("\nIVA al 4%%\t$%.2f", 0.04*total);
                System.out.printf("\n----------------------------------------------");
                System.out.printf("\nTotal con IVA\t$%.2f", total+0.04*total);
                System.out.printf("\n\033[1m Producto sorpresa\033[0m\n");
                    break;
            case 4:
                System.out.println("\n\033[1mFACTURA\033[0m");
                System.out.println("----------------------------------------------");
                System.out.printf("Atrículo\t%s", nombre);
                System.out.printf("\nPrecio\t$%.2f/unidad", precio);
                System.out.printf("\nCantidad\t%d\n", cantidad);
                System.out.println("----------------------------------------------");
                if (cantidad>3){
                    prendas=(cantidad-(cantidad/3)) ;
                    System.out.printf("Promoción 3x2   Paga solo %d unidades", prendas);
                    System.out.printf("\nTotal\t$%.2f", prendas*precio);
                    System.out.printf("\nIVA al 21%%\t4%.2f", 0.21*prendas*precio);
                    System.out.printf("\n----------------------------------------------");
                    System.out.printf("\nTotal con IVA\t$%.2f", (0.21*prendas*precio) +(prendas*precio));
                } else {
                    System.out.printf("Total\t$%.2f", cantidad*precio);
                    System.out.printf("\nIVA al 21%%\t$%.2f", 0.21*cantidad*precio);
                    System.out.printf("\n----------------------------------------------");
                    System.out.printf("\nTotal con IVA\t$%.2f", (0.21*cantidad*precio)+(cantidad*precio));
                }
                System.out.printf("\n\033[1m Producto sorpresa\033[0m\n");
                    break;
            default:
                System.out.println("Producto no encontrado");
                break;
        }

        

        // para que al final del ticket se aparezca unh producto sorpresa debemos decirle a la maquina que puede elegir entre las 4 sorpresas que soreteamos
        sorpresa= (int) (Math.random()*4)+1;
        switch (sorpresa) {
            case 1:
                System.out.println("Descuento del 5% en la próxima compra");
                break;
            case 2 :
                System.out.println("Bolsa reutilizable de regalo");
            case 3:
                System.out.println("Vale por un café gratis");
            case 4:
                System.out.println("Pegatina oficial de El Porte Inglés");
            default:
                break;
        }

        escaner.close();
    }
}