package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
       /* 7. Se quiere realizar un programa que GENERE ALEATORIAMENTE 12 NOTAS (ENTRE 0 Y 10)
        (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media,
        la nota más alta que ha sacado y la menor.*/

        double notas[] = new double[12];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (Math.random() * 10); //no hacemos casting explicito porque el meto MAth.random() ya genera un
            //double

        }
        //System.out.println(Arrays.toString(notas));
        for (double elemento: notas){//para cada elemento de tipo double del array notas
            System.out.printf("%.2f\t", elemento);//mostramos cada nota con dos decimales

        }
        double suma = 0;
        for (double elemento:notas){
            suma = suma + elemento;

        }
        System.out.printf("\nmedia = %.2f", (suma/ notas.length));
        //para sacar la mas alta y la mas baja ordenamos el array y mostramos el primer elemento (mas baja) y el ultimo (mas alta)
        Arrays.sort(notas);
        System.out.printf("\nmas alta = %.2f", notas[notas.length - 1]);
        System.out.printf("\nmas baja = %.2f", notas[0]);

    }
        }


