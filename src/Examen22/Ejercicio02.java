package Examen22;

import java.util.Scanner;

public class Ejercicio02 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int year = pedirEdad();
       /* System.out.println(year);
        String tipo = devolverTipo(year);
        System.out.println(tipo);
        int precio = calcularPrecio(tipo);
        System.out.println(precio);
        imprimirTicket(tipo,year);*/
        imprimirTicket(devolverTipo(year), calcularPrecio(devolverTipo(year)));
        String tipo = devolverTipo(year);


    }
    //pregunta la edad y devuelve la respuesta en años;
    static int pedirEdad(){
        System.out.println("pedir edad");
        int edad = sc.nextInt();
        sc.nextLine();
        return edad;

    }
    //recibe la edad en años y devuelve "adulto" o "niño"
    static String devolverTipo(int year){
        if (year>= 18){
            return "Adulto";

        } else {
           return  "Menor de edad";
        }

    }
    //Recibe el tipo de entrada y devuelve el precio en euros
    static int calcularPrecio(String tipo){
        if(tipo.equals("Adulto")){

            return 4;
        } else {
            return 2;
        }

    }
    //imprimo el ticket indicando el tipo de entrada y el precio
    static void imprimirTicket(String tipo, int precio){
        System.out.println("-------------------------");
        System.out.println("|     TICKET DE ENTRADA      |");
        System.out.println("|" + tipo + "     " + precio + "€");

    }
}
