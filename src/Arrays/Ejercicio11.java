package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
       /* 11. Generar un array de 10 enteros ordenados crecientemente.  Se debe mostrar la posición en que se encuentra. Si no está,
        indicarlo con un mensaje.*/

        //generamo el array aleatorimente con numeros entre  1 y 20 (por ejemplo)
        int[] enteros = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int)(Math.random() * 20 +1);
        }
        //lo ordenamos
        Arrays.sort(enteros);
        System.out.println(Arrays.toString(enteros));
        //Ahora empieza el ejercicio
        /*Pedir un número por teclado y buscarlo en el array.*/
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("introduce un numero entre 1 y 20: ");
            numero = sc.nextInt();
            if(numero <1 || numero >20){
                System.out.println("Numero fuera de rango. ");
            }
        } while (numero<1||numero>20);

        //lo buscamos en el array
        boolean encontrado = false; //si recorremos todo el array y no cambia este valor, es que no esta
        for (int i = 0; i < enteros.length ; i++) {
            if(enteros[i]==numero){
                System.out.println("El numero " + numero + "esta en la posicion " + (i+1) + "(indice " + i + ").");
                //cambiamos el false a true para que no nos imprima luego que no lo hemos encontrado
                encontrado = true;
                break;
            }

        }
        //si salimos de for y encontrado sigue como false es que el numero no esta en el array
        if (encontrado==false){
            System.out.println("el numero no esta en el array");
        }
    }


}
