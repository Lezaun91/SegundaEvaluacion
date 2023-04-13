package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
       /* 4. Haz un programa en el que se cree un array que lea por teclado la longitud que tiene
        que tener .*/

         //controla que el numero introducido para el tamañano no sea 0 ni negativo con while o do while
        int num = 0;
        do {
            Scanner sc = new Scanner(System.in);
            num= sc.nextInt();
            if (num <=0){
                System.out.println("Error introducelo otra vez");
            } else {
                System.out.println("Ok");
            }
        } while (num <=0);

        //inicializa con numeros aleatorios comprendidos entre el 1 y el 10
        int[] array_numeros = new int[num];
        int max = 10;
        int min = 1;

        for (int i = 0; i < array_numeros.length; i++) {
            array_numeros[i] = (int) (Math.random() * (max - min + 1) + (min));
        }
        System.out.println(Arrays.toString(array_numeros));

        //Mostrar la suma de todos los números que se guarden en el array
        int sumador = 0;
        int valorMaximo = 0;
        for (int i = 0; i < array_numeros.length; i++) {
            sumador = sumador + array_numeros[i];
            if(valorMaximo < array_numeros[i]){
                valorMaximo = array_numeros[i];
            }
        }
        System.out.println(sumador);
        System.out.println(valorMaximo);
            {
        }
    }
}
