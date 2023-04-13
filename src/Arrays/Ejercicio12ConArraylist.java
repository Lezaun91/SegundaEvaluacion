package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio12ConArraylist {
    public static void main(String[] args) {
         /*12. Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y
        mezclarlos en un tercero de la forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.*/
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        //rellenamos A y B
        for (int i = 0; i <10 ; i++) {
            int numeroA = (int)(Math.random()* 10 + 1);
            A.add(numeroA);
            int numeroB = (int)(Math.random()* 10 + 1);
            A.add(numeroB);
        }
        System.out.println(A);
        System.out.println(B);
        //rellenamos
        for (int i = 0; i <10 ; i++) {
            C.add(A.get(i));//pedimos en c lo que tenga en la posicion i de A
            C.add(B.get(i));


        }
    }
}
