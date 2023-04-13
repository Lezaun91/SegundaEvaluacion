package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*9. Realizar un programa que declare un array y lo vaya llenando de números intoducidos
        por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los
        elementos que contiene (el número negativo sólo sirve para finalizar el programa, no
                entra en el array).*/
        //int[] num = new int[];-->como no sabemos cuantos utilizamos arraylist. que es como un chicle
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        int numero = 0;
        do {
            System.out.println("Introduce numero, negativo para terminar ");
            numero = sc.nextInt();
            if(numero >0){
                num.add(numero);//si fuera un array seria array[i] = numero

            }

        } while (numero >=0); //mientras sea negativo, seguimos
        //cuando terminamos, imprimimos
        System.out.println(num);
        System.out.println("Ordenado");
        Collections.sort(num);
    }
}
