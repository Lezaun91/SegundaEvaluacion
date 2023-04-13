package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
       /* 8. Realizar un programa que pida un tamaño de array por teclado -> controlamos que no entren negativos o 0
        y a continuación cree un
        array formado por elementos aleatorios pares entre 1 y 50.*/
        Scanner sc = new Scanner(System.in);
        int tamaño = 0;

        do {
            System.out.println("Tamaño del array: ");
            tamaño = sc.nextInt();

        } while (tamaño <=0);

        // creamos un array formado por elementos aleatorios pares entre 1 y 50 (enteros)
        int[] pares = new int[tamaño];
        //tenemos que utilizar un while del cual saldremos cuando hayamos rellenado el array
        int i = 0;// con esta variable llevamos la posicion en el array;avanzara cada vez que encontramos un numero par
        //terminamos cuando hayamos rellenado el array, cuando la i llegue a la ultima posicion -> tamaño.
        while(i< pares.length) {
            //genero un numero
            int numero = (int)(Math.random() * 50 + 1);
            //compruebo si es par
            if (numero % 2 ==0){
                pares[i] = numero;//guardo el numero en el array
                i++;//incremento la i para avanzar a la siguiente posicion
            }





        }
        System.out.println(Arrays.toString(pares));

    }
}
