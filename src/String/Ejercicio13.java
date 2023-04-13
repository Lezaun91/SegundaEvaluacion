package String;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*Ejercicio 13
        Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma
        es aquella que se lee igual adelante que atrás.*/
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();

        //para poder comparar la cadena al derecho y al reves tenemos que eliminar los espacios
        cadena = cadena.toLowerCase().replace(" ", "");
        //System.out.println(cadena);
        //se parece al 9 -> invertir una cadena
        String invertida ="";
        for (int i = cadena.length() -1; i >= 0 ; i--) {//empezamos en la ultima posicion y vamos recorriendo la cadena hasta llegar
           // a la primera posicion (indice 0)
            invertida = invertida + cadena.charAt(i);


        }System.out.println(cadena);
        //si es un palindromo tienen que ser iguales cadena e invertida
        if (cadena.equals(invertida)){//equivale a hacer igual igual == pero en string
            System.out.println("ES UN PALINDROMO");
        } else {
            System.out.println("NO ES PALINDROMO");
        }



    }
}
