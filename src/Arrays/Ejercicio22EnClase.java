package Arrays;

import java.util.Arrays;

public class Ejercicio22EnClase {
    public static void main(String[] args) {
        /* 22. Haz un programa que realice lo siguiente:
        • Crea una tabla de 5x5 enteros.
        • Carga la tabla con valores numéricos enteros.
        • Suma todos los elementos de cada fila y todos los elementos de cada columna
        visualizando los resultados en pantalla.*/
        int[][] tabla = new int[5][5];
        int[] sumaFilas = new int[5];
        int[] sumaColumnas = new int[5];


        for (int i = 0; i < tabla.length; i++) {
            int sumaf = 0;
            int sumac = 0;
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * 10);//rellena valores entre 0 y 10
                System.out.print(tabla[i][j] + "\t");
                //aqui tenemos ya el arrays bidimensional pintado y queremos sacar las filas y columnas
                sumaf += tabla[i][j];
                sumac += tabla[j][i];
            }
            sumaFilas[i] = sumaf;
            sumaColumnas[i]=sumac;
            System.out.print("fila " + i + " suma " + sumaf);
            //System.out.print("fila " + i + " suma " + sumaf + " ");
            System.out.println();
        }
        System.out.println(Arrays.toString(sumaFilas));
        System.out.println(Arrays.toString(sumaColumnas));
    }
}