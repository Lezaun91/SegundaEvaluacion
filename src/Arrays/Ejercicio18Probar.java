package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio18Probar {
    public static void main(String[] args) {
       /* 18. Generar dos arrays de 10 enteros, que estarán ordenados crecientemente. Copiar
       (fusionar) ambos en un tercero, de forma que sigan ordenados.*/

        //los voy a crear directamente ordenados

        //parece más facil con Arraylist
        ArrayList<Integer> enteros1 = new ArrayList<>();
        ArrayList<Integer> enteros2 = new ArrayList<>();
        //los podemos rellenar aleatoriamente
        for (int i = 0; i < 10; i++) {
            enteros1.add((int) (Math.random()*100));
            enteros2.add((int) (Math.random()*100));
        }
        //System.out.println(enteros1);
        //System.out.println(enteros2);
        //los ordenamos

        Collections.sort(enteros1);
        Collections.sort(enteros2);
        System.out.println(enteros1);
        System.out.println(enteros2);

        //creamos un tercer arraylist donde meteremos los otros dos
        ArrayList<Integer> enteros3 = new ArrayList<>();
        enteros3.addAll(enteros1);
        enteros3.addAll(enteros2);
       // System.out.println(enteros3);

        Collections.sort(enteros3);
        System.out.println(enteros3);
    }
}
