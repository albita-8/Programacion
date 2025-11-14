import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        char respuesta1;
        char respuesta2;
        char respuesta3;
        char respuesta4;
        char respuesta5;
        int solucion;

        Scanner escaner = new Scanner(System.in);


        System.out.println("\033[0;1mCUESTIONARIO DE 1º DAW\033[0m");
        System.out.println("1. ¿Cuál de los siguientes tipos de datos tiene más precisión?");
        System.out.println("a. int");
        System.out.println("b. double");
        System.out.println("c. float");
        respuesta1=escaner.next().charAt(0);

        if (respuesta1 =='a') {
        System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?");
        System.out.println("a. XML");
        System.out.println("b. SELECT");
        System.out.println("c. SQL");
        respuesta2=escaner.next().charAt(0);
        if (respuesta2 =='c') {
        System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
        System.out.println("a. href");
        System.out.println("b. a");
        System.out.println("c. link");
        respuesta3=escaner.next().charAt(0);
        if (respuesta3 =='c') {
        System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
        System.out.println("a. /etc");
        System.out.println("b. /config");
        System.out.println("c. /cfg");
        respuesta4=escaner.next().charAt(0);
        if (respuesta4 =='b') {
        System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
        System.out.println("a. RAM");
        System.out.println("b. EPROM");
        System.out.println("c. ROM");
        respuesta5=escaner.next().charAt(0);
        if (respuesta5 =='a') {
        System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        solucion = 0;
if (respuesta1 == 'a') solucion++;
if (respuesta2 == 'c') solucion++;
if (respuesta3 == 'c') solucion++;
if (respuesta4 == 'b') solucion++;
if (respuesta5 == 'a') solucion++;

        System.out.println("Ha obtenido "+ solucion + " puntos");

        escaner.close();
    }
}
