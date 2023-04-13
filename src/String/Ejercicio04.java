package String;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*Ejercicio 4
        Escribe un programa que lea el nombre de una ciudad y compruebe si el nombre termina
        con “burgo”. El programa debe imprimir true o false.*/
        Scanner sc = new Scanner(System.in);
        String ciudad = sc.nextLine();
        boolean resultado =ciudad.endsWith("burgo");
        /*System.out.println("¿Termina con \"burgo\"?" + ciudad.endsWith("burgo"));*/
        System.out.println("¿termina por \"burgo\" " + resultado);
    }
}
