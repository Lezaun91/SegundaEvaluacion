package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploContadorAes {
    public static void main(String[] args) {
        //Crear un programa que pida 10 letras,
        Scanner sc = new Scanner(System.in);
        char[] caracteres = new char[10];
        //las vaya guardando en un array de caracteres
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = sc.next().charAt(0); //guarda en la posicion del indice i el caracter que introducimos por teclado

        }
        System.out.println(Arrays.toString(caracteres));
        //luego pide un caracter
        System.out.println("¿Que caracter quieres que cuente?");
        char c = sc.next().charAt(0);
        //al final muestra cuantas veces aparece ese caracter
        int contador = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == c){
                contador++;
            }

        }
        System.out.println("tenemos " + contador + " " + c);
    }
}
