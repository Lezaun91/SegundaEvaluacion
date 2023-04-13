package String;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
       /* Ejercicio 5
        Escribe un programa que compruebe si una cadena dada comienza por “J”, sin que tenga en
        cuenta si está en mayúsculas o minúsculas. El programa debe imprimir true o false.*/
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine().toLowerCase();
     /*   boolean resultado = cadena.startsWith("J")|| cadena.startsWith("j");
        System.out.println("¿Empieza por j o J " + resultado);*/
        /*System.out.println("¿Empieza con j? " + (cadena.startsWith("j") || cadena.startsWith("J")));*/
        System.out.println("¿Empieza con j? " + cadena.startsWith("j"));

    }
}
