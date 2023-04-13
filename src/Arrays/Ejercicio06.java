package Arrays;

import java.util.Arrays;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*6. Realizar un programa en el se se inicialice un array de longitud 20 con números
        aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los
        números positivos,la media de los negativos y contar el número de ceros.*/

        int numero[] = new int[200];
        int max = 10;
        int min = -10;
        if (min <0){
            min = min -1;
        }
        int contadorCeros = 0;
        int contadorPositivos = 0;
        int sumadorPositivos = 0;
        int contadorNegativos = 0;
        int sumadorNegativos = 0;
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * (max - min + 1) + (min));
            if(numero[i] ==0){
                contadorCeros++;
            } else if (numero[i] <0){
                contadorNegativos++;
                sumadorNegativos = sumadorNegativos + numero[i];
            } else if (numero[i] > 0) {
                contadorPositivos++;
                sumadorPositivos = sumadorPositivos + numero[i];

            }//numerador arriba, denominador abajo

        }
        System.out.println(Arrays.toString(numero));
        System.out.println("Negativos totales: " + contadorPositivos);
        System.out.printf("media negativos es : %.2f", ((float)sumadorNegativos/(float)contadorNegativos));
        System.out.println("\nPositivos totales: " + contadorNegativos);
        System.out.printf("media positivos es : %.2f", ((float)sumadorPositivos/(float)contadorPositivos));
        System.out.println("\nceros totales : " + contadorCeros);
    }
}