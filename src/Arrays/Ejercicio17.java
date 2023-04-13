package Arrays;

import java.util.Arrays;

public class Ejercicio17 {
    public static void main(String[] args) {
       /* 17. Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar
        en otro array los elementos pares del primero, y, a continuación, los elementos impares.*/
        int[] numero = new int[10];
        int[] paresImpares = new int[10];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int)(Math.random() * 100);

        }
        System.out.println(Arrays.toString(numero));
        int posArray2 = 0;//esta variable es para guardar la posicion en el segundo array; avanzara cuando metamos un par; si
        //no no avanza
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]%2==0){
                paresImpares[posArray2] = numero[i];
                //avanzo una posicion en el array de paresimpares
                posArray2++;
            }
        }
        System.out.println(posArray2);
        System.out.println(Arrays.toString(paresImpares));
        //ahora rellenamos el resto del array: lo vuelvo a recorrer buscando los impares
        for (int i = 0; i < numero.length; i++) {
            if (numero[i]%2 != 0){
                paresImpares[posArray2] = numero[i];
                //avanzo una posicion en el array de paresimpares
                posArray2++;
            }

        }
        System.out.println(Arrays.toString(paresImpares));
    }
}
