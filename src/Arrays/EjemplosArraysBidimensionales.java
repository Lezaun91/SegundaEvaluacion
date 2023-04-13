package Arrays;

import java.util.Arrays;

public class EjemplosArraysBidimensionales {
    public static void main(String[] args) {
        //declaramos un array de 3*4
        int[][] tabla= new int[3][4];

        // lo vamos a rellenar con numeros aleatorios entre 1 y 4
        for (int i = 0; i < tabla.length; i++) {//para cada final (array) que tenga la tabla, hacer lo siguiente
            for (int j = 0; j < tabla[i].length; j++) {//table[i].lenght es la longitud o el tamaño de la fila i, que el el
                //array que estoy recorriendo en este momento
                tabla[i][j] = (int)(Math.random() * 4 + 1);

            }

        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));

        }
    }
}
