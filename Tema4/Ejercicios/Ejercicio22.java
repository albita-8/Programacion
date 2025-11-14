public class Ejercicio22 {
    public static void main(String[] args) {
        int cargo;
        int dias;
        int estado;
        float sueldo=0;
        float operacion;
        float total;
        float descuento;
        float suma;

        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.printf("Introduzca el cargo del empleado (1 - 3): ");
        cargo=Integer.parseInt(System.console().readLine());

        System.out.printf("¿Cuántos días ha estado de viaje visitando clientes? ");
        dias=Integer.parseInt(System.console().readLine());

        System.out.printf("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estado=Integer.parseInt(System.console().readLine());
        System.out.println("\n-----------------------------------");
        
        switch (cargo) {
            case 1:
                sueldo=950;
                System.out.printf("|Sueldo base               %.2f|\n", sueldo);
                break;
            case 2:
                sueldo=1200;
                System.out.printf("|Sueldo base               %.2f|\n", sueldo);
                break;
            case 3:
                sueldo=1600;
                System.out.printf("|Sueldo base              %.2f|\n", sueldo);
                break;
        }

        operacion=dias*30;
        System.out.printf("|Dietas (%d viajes)          %.2f|\n", dias, operacion);
        System.out.println("\n-----------------------------------");

        total=operacion+sueldo;
        System.out.printf("|Sueldo bruto                %.2f|\n", total);


        if (estado==1) {
            descuento=0.25f*total;
            System.out.printf("|Retención IRPF (25%%)         %.2f|\n", descuento);
        } else {
            descuento=0.20f*total;
            System.out.printf("|Retención IRPF (20%%)         %.2f|\n", descuento);
        }

        System.out.println("\n-----------------------------------");
        suma=total-descuento;
        System.out.printf("|Sueldo neto         %.2f|\n", suma);
        System.out.println("\n-----------------------------------");

    }
}
