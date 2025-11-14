import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        String sabor;
        String tipoChocolate = "";
        String nata;
        String nombre;
        float precio = 0;
        float precioNata = 0;
        float precioNombre = 0;
        float total;

        Scanner escaner = new Scanner(System.in);

        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        sabor = escaner.nextLine().toLowerCase();

        switch (sabor) {
            case "manzana":
                precio = 18;
                break;
            case "fresa":
                precio = 16;
                break;
            case "chocolate":
                System.out.print("¿Qué tipo de chocolate quiere (negro o blanco)? ");
                tipoChocolate = escaner.nextLine().toLowerCase();

                switch (tipoChocolate) {
                    case "negro":
                        precio = 14;
                        break;
                    case "blanco":
                        precio = 15;
                        break;
                    default:
                        System.out.println("Tipo de chocolate no válido.");
                        break;
                }
                break;
            default:
                System.out.println("Sabor no válido.");
                break;
        }

        System.out.print("¿Quiere nata? (si o no): ");
        nata = escaner.nextLine().toLowerCase();

        if (nata.equals("si")) {
            precioNata = 2.50f;
        }

        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        nombre = escaner.nextLine().toLowerCase();

        if (nombre.equals("si")) {
            precioNombre = 2.75f;
        }

        total = precio + precioNata + precioNombre;

        System.out.printf("\nTarta de %s %s: %.2f\n", sabor, tipoChocolate, precio);
        System.out.printf("Con nata: %.2f\n", precioNata);
        System.out.printf("Con nombre: %.2f\n", precioNombre);
        System.out.printf("Total: %.2f\n", total);
        
        escaner.close();

    }
}

