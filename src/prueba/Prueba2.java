package prueba;

import java.util.Arrays;

public class Prueba2 {
    public static void main(String[] args) {
          /* 17. Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar
        en otro array los elementos pares del primero, y, a continuación, los elementos impares.*/
        int[] numeros = new int[10];
        int[] paresImpares = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()* 100);
        }
        int posicionArray = 0;
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < paresImpares.length; i++) {
            if(numeros[i]%2==0){
                paresImpares[posicionArray]= numeros[i];
                posicionArray++;
            }

        }
        for (int i = 0; i < paresImpares.length; i++) {
            if(numeros[i]%2!=0){
                paresImpares[posicionArray]= numeros[i];
                posicionArray++;
            }

        }
        System.out.println(Arrays.toString(paresImpares));
    }

}
