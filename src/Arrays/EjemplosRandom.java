package Arrays;

import java.util.Arrays;

public class EjemplosRandom {
    public static void main(String[] args) {
        /*for (int i = 0; i <20 ; i++) {
            int num = (int)(Math.random() * 10 + 1);
            System.out.print(num + "\t");*/
            int[] numeros = new int[200];
            int max = 10;
            int min = -10;
            if (min < 0) {
                min = min - 1;
            }
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * (max - min + 1) + (min));
            }
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
        }
    }

