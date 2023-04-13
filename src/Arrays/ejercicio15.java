package Arrays;

import java.util.Arrays;

public class ejercicio15 {
    public static void main(String[] args) {
      /*  15. Crear un programa que rellene aleatoriamente un array de 10 números enteros y a
        continuación desplace sus elementos una posición hacia la derecha (el último pasa a ser
                el primero).*/
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = (int) (Math.random()* 100);

        }
        System.out.println(Arrays.toString(numeros));
        numeros = desplazar(numeros);//paso el array de enteros al metodo, en el metodo se desplazan los elementos y
        //me vuelve el array desplazado
        System.out.println(Arrays.toString(numeros));
    }
    //creamos un metodo que recibe un array y desplaza sus elementos una posicion a la derecha
    //devuelve el array desplazado
    public static int[] desplazar(int[]enteros) {
        //pero con el metodo clone() puedo hacer una copia del array
        //int[] solucion = enteros.clone();//creamos un array y le metemos los mismos elementos que tiene enteros
        //ahora desplazamos
        int[] solucion = new int[10];
        //en la primera posicion ira el ultimo de enteros
        solucion[0] = enteros[enteros.length - 1];
        for (int i = 0; i < enteros.length - 1; i++) {
            solucion[i+1] = enteros[i];
        }

        return solucion;

    }
    }


