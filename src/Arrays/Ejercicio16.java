package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*16. Crear un programa que rellene aleatoriamente un array de 10 números enteros y a
        continuación pedir por teclado una posición (entre 0 y 9). Eliminar el elemento situado
        en la posición dada sin dejar huecos.*/
        Scanner sc = new Scanner(System.in);

        //es mas facil con Arraylist
        ArrayList<Integer> enteros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            enteros.add((int)(Math.random()* 100));//lo que hay dentro de los parentesis en el nuemero que se genera
            //aleatoriamente
        }
        System.out.println(enteros);


        //pido el indice del elemento a eliminar
        //vamos a controlar que entre un numero entre 0 y 9
        int indice = 0;
        do {
            System.out.println("Pide el elemento a eliminar");
            indice = sc.nextInt();
            if(indice<0||indice>9){
                System.out.println("Error. El numero debe estar entre 0 y 9");
            }

        }while (indice<0||indice>9);//mientras el indice sea incorrecto, seguimos en el bucle

        //si llegamos aqui es que tenemos un indice entre 0 y 9
        //procedemos a eliminarlo
        enteros.remove(indice);
        //lo imprimimos para ver si se ha eliminado
        System.out.println(enteros);
    }
}
