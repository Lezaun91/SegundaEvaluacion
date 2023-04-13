package String;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
       /* Ejercicio 2
        Realizar un programa que comprueba si una cadena leída por teclado comienza por una
        subcadena introducida también por teclado.*/
        Scanner sc = new Scanner(System.in);
        //si una cadena leida por teclado
        String cadena = sc.nextLine();
        //comienza por una subcadena introducida tambien por teclado
        String cadena1 = sc.nextLine();
        boolean resultado = cadena.startsWith(cadena1);
        System.out.println("¿\" " + cadena + "\"empieza por " + cadena1 + "?" + resultado);

    }
}
