package Arrays;

import java.util.Arrays;

public class Ejercicio23 {
    public static void main(String[] args) {
       /* 23. Haz un programa que realice lo siguiente:
        Crea una tabla de 5x5 enteros y nombre ‘diagonal’.
        Carga la tabla de forma que los componentes pertenecientes a la diagonal de la
        matriz tomen el valor 1 y el resto el valor 0 Muestra el contenido de la tabla en pantalla.*/
        int[][] diagonal = new int[5][5];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i==j){
                    diagonal[i][j] = 1;
                    System.out.print(diagonal[i][j]);
                } else {
                    diagonal[i][j] = 0;
                    System.out.print(diagonal[i][j]);

                }
            }
            System.out.println();

        }
        /*//for (int i = 0; i < diagonal.length; i++) {
        System.out.println(Arrays.toString(diagonal[i]));*/
    /*}*/
    }
}
