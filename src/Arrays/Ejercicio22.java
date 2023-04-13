package Arrays;

import java.util.Arrays;

public class Ejercicio22 {
    public static void main(String[] args) {
       /* 22. Haz un programa que realice lo siguiente:
        • Crea una tabla de 5x5 enteros.
        • Carga la tabla con valores numéricos enteros.
        • Suma todos los elementos de cada fila y todos los elementos de cada columna
        visualizando los resultados en pantalla.*/
        int[][] tabla = new int[5][5];
        int[] sumaFilas = new int[5];
        int[] sumaColumnas = new int[5];
        int sumaf = 0;
        int sumac= 0;

        for (int i = 0; i < tabla.length; i++) {
            sumaf = 0;
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * 10);//rellena valores entre 0 y 10
                System.out.print(tabla[i][j] + "\t");
                //aqui tenemos ya el arrays bidimensional pintado y queremos sacar las filas y columnas
                sumaf = sumaf + tabla[i][j];
                sumaFilas[i]=sumaf;
            }
            System.out.print("fila " + i + " suma " + sumaf);
            //System.out.print("fila " + i + " suma " + sumaf + " ");
            System.out.println();
        }
        for (int k = 0; k < tabla.length ; k++) {
            sumac = 0;
            for (int y = 0; y < tabla[k].length ; y++) {
               //preguntar porque salen los mismos valores
                // System.out.print(tabla[k][y] + "\t");
                sumac += tabla[y][k];
                sumaColumnas[k] = sumac;
            }

            System.out.print("columna " + k + " suma " + sumac);
            System.out.println();
        }

        System.out.println(Arrays.toString(sumaFilas));
        System.out.print(Arrays.toString(sumaColumnas));
    }
}
//sumac = sumaf + tabla[j][i];
                       /* sumaFilas[j]= tabla[i][0];
                        sumaColumnas[i]= tabla[0][j];*/
/*sumaColumnas[i]= j+j;*/
//sumaFilas[j]= tabla[i][j]+ tabla[i][j]+tabla[i][j]+tabla[i][j]+tabla[i][j];