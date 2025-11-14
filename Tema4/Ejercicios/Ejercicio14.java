import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        char respuesta1;
        char respuesta2;
        char respuesta3;
        char respuesta4;
        char respuesta5;
        char respuesta6;
        char respuesta7;
        char respuesta8;
        char respuesta9;
        char respuesta10;
        int puntos = 0;

        Scanner escaner = new Scanner(System.in);


        System.out.println("\033[0;1mTEST DE FIDELIDAD\033[0m");
        System.out.println("\033[0;1m=================\033[0m");
        System.out.println("Este programa te dirá si hay probabilidad de que tu pareja te esté siendo infiel.");


        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta1=escaner.next().charAt(0);

        if (respuesta1 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }

        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta2=escaner.next().charAt(0);

        if (respuesta2 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }

        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta3=escaner.next().charAt(0);

        if (respuesta3 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }

        System.out.println("4. Ahora se afeita y se asea con mas frecuencia (si es hombre) o ahora se arregla el pelo y se asea con mas frecuencia (si es mujer).");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta4=escaner.next().charAt(0);

        if (respuesta4 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }

        System.out.println("5. No te deja que mires su agenda del teléfono móvil.");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta5=escaner.next().charAt(0);

        if (respuesta5 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }

        System.out.println("6. A veces tienes llamadas que dice no querer contestar cuando estás tú delante");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta6=escaner.next().charAt(0);

        if (respuesta6 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }

        System.out.println("7. últimamente se preocupa más en la línea y/o estar bronceado/a.");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta7=escaner.next().charAt(0);

        if (respuesta7 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }

        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta8=escaner.next().charAt(0);

        if (respuesta8 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }

        System.out.println("9. Has notado que últimamente se perfuma más.");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta9=escaner.next().charAt(0);

        if (respuesta9 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        System.out.println("a. True");
        System.out.println("b. False");
        respuesta10=escaner.next().charAt(0);

        if (respuesta10 =='a') {
            puntos += 3;
        } else {
            puntos += 0;
        }


        if (puntos >= 0 && puntos <= 10) {
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (puntos >= 11 && puntos <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, "
                    + "aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (puntos > 22 && puntos <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. "
                    + "Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }
escaner.close();
    }
}
