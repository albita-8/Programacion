import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int mes;
        int dia;
        String signo;


        Scanner escaner = new Scanner(System.in);

        System.out.println("Este programa te dirá cuál es tu horoscopo.");
        System.out.println("Introduce el número de mes en el que nació (1-12): ");
        mes=escaner.nextInt();

        System.out.println("Ahora introduce el día: ");
        dia=escaner.nextInt();

        switch (mes) {
            case 1:
                signo = (dia < 20) ? "Capricornio" : "Acuario";
                break;
            case 2:
                signo = (dia < 19) ? "Acuario" : "Piscis";
                break;
            case 3:
                signo = (dia < 21) ? "Piscis" : "Aries";
                break;
            case 4:
                signo = (dia < 20) ? "Aries" : "Tauro";
                break;
            case 5:
                signo = (dia < 21) ? "Tauro" : "Géminis";
                break;
            case 6:
                signo = (dia < 21) ? "Géminis" : "Cáncer";
                break;
            case 7:
                signo = (dia < 23) ? "Cáncer" : "Leo";
                break;
            case 8:
                signo = (dia < 23) ? "Leo" : "Virgo";
                break;
            case 9:
                signo = (dia < 23) ? "Virgo" : "Libra";
                break;
            case 10:
                signo = (dia < 23) ? "Libra" : "Escorpio";
                break;
            case 11:
                signo = (dia < 22) ? "Escorpio" : "Sagitario";
                break;
            case 12:
                signo = (dia < 22) ? "Sagitario" : "Capricornio";
                break;
            default:
                signo = "Fecha no válida";
        }

        System.out.println("Su horóscopo es " + signo);

        escaner.close();
        }
    }
