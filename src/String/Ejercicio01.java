package String;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*Ejercicio 1
        Escribir por pantalla cada carácter de una cadena introducida por teclado.*/
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        for (int i = 0; i <= cadena.length() - 1; i++) {//recorremos el string desde el primer caracter (primera posicion o
            //indice 0) hasta el ultimo (ultimo posicion, indice lenght()-1)
            System.out.print(cadena.charAt(i) + " ");
        }
    }
}
