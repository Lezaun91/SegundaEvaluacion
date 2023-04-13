package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*2. Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
        muestre en el orden inverso al introducido.*/
        Scanner sc = new Scanner(System.in);
        double[] decimales = new double[5];
        for (int i = 0; i < decimales.length; i++) {
            System.out.print("numero " + (i+1) + ": ");
            decimales[i] = sc.nextDouble();
        }
        //hasta aqui igual que el ejercicio uno
        //para imprimirlo al reves un for que vaya desde la ultima posicion a la primera
        for (int i = decimales.length - 1; i >=0 ; i--) {
            System.out.print(decimales[i] + " ");

        }
    }
}
