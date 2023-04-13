package Metodos;

import java.util.Scanner;

/**@uthor Victor*/
public class Ejercicio14DeStringConMetodos {

    public static void main(String[] args) {
        /*Ejercicio 14
        Suponiendo que hemos introducido una cadena por teclado que representa una frase
        (palabras separadas por espacios), realiza un programa que cuente cuántas palabras tiene.*/

        //String s = pedirFrase();

        contarPalabras(calcularPalabras(pedirFrase()));

        //tenemos que contar las palabras
        /*for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' '){
                contador++;// si encontramos un espacio es que hay una palabra nueva -> incrementamos el contador
            }
        }*/

    }
    //un metodo que pida la frase
    public static String pedirFrase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String cadena = sc.nextLine();
        return cadena;
    }
    // otro meotodo que calcule las palabras

    public static int calcularPalabras(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;// si encontramos un espacio es que hay una palabra nueva -> incrementamos el contador
            }
        }
        return contador + 1;
    }
     //otro metodo que imprima la cantidad de palabras
    public static void contarPalabras(int contador){
        System.out.println("hay " + (contador) + " palabras");

    }
    /*public static void contarPalabras(){
        System.out.println("hay " + (calcularPalabras(pedirFrase())) + " palabras");*/
}

