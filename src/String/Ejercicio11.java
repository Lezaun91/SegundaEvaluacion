package String;
/*dificultad: alta*/

import java.util.Scanner;

//* @uthor Victor*/
public class Ejercicio11 {
    public static void main(String[] args) {
        /*Ejercicio 11
        Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a
        minúsculas y viceversa.*/
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        System.out.println("cambia las mayusculas por minusculas y viceversa");
        String cambiada = "";
        System.out.println(cadena);




        for (int i=0 ; i<cadena.length() ; i++) {
            if (Character.isLowerCase(cadena.charAt(i))) {
                cambiada = cambiada + Character.toUpperCase(cadena.charAt(i));
               // System.out.println(cambiada);
            }
            else//si entra aqui es que va a ser mayuscula, hay que pasarlo a minuscula
            {
                cambiada = cambiada + Character.toLowerCase(cadena.charAt(i));
                //System.out.println(cambiada);
            }
        } System.out.println(cambiada);
    }


        }

