package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
       /* 5. Hacer un programa que inicialice una lista de números con valores aleatorios (10
        valores), y los muestre ordenados de menor a mayor.*/
        Scanner sc = new Scanner(System.in);

        int numero[] = new int[10];

        for (int i = 0; i < numero.length ; i++) {
            numero[i] = (int) (Math.random() * 10);

        }
        System.out.println(Arrays.toString(numero));

        Arrays.sort(numero);
        System.out.println(Arrays.toString(numero));


    }
}
