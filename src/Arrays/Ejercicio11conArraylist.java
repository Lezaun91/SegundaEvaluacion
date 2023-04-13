package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio11conArraylist {
    public static void main(String[] args) {
       /* 11. Generar un array de 10 enteros ordenados crecientemente.  Se debe mostrar la posición en que se encuentra. Si no está,
        indicarlo con un mensaje.*/

        //generamo el array aleatorimente con numeros entre  1 y 20 (por ejemplo)
        ArrayList<Integer> enteros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 20 + 1);
            enteros.add(numero);
        }
        //lo ordenamos
        Collections.sort(enteros);
        System.out.println(enteros);
        //Ahora empieza el ejercicio
        /*Pedir un número por teclado y buscarlo en el array.*/
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("introduce un numero entre 1 y 20: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 20) {
                System.out.println("Numero fuera de rango. ");
            }
        } while (numero < 1 || numero > 20);

        //lo buscamos en el array
        //boolean encontrado = false; //si recorremos todo el array y no cambia este valor, es que no esta
        if (enteros.contains(numero)) {
            System.out.println("el numero esta en la posicion " + (enteros.indexOf(numero) + 1) + " indice " + enteros.indexOf(numero) + ").");
        } else {
            //sino esta indicarlo con un mensaje
            System.out.println("El numero no esta en el arraylist");
        }

        //si salimos de for y encontrado sigue como false es que el numero no esta en el array


    }
}
