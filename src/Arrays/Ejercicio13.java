package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
       /* 13. Haz un programa que rellene por teclado un array de 5 números enteros. La aplicación
        debe indicarnos si los números están ordenados de forma creciente, decreciente, o si
        están desordenados.*/
        Scanner sc = new Scanner(System.in);
        //con Array o Arraylist, es mas facil con Arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();


        //rellenar el Arraylist por teclado
        for (int i = 0; i < 5; i++) {
            System.out.print("numero: " + (i+1) + ":");
            int n = sc.nextInt();
            sc.nextLine();
            arrayList.add(n);
        }
       // System.out.println(arrayList);
        //no lo ordenamos comprobamos si esta ordenado


        //orden creciente: para todos los elementos i tine que ser <= i+1
        boolean ordenCreciente = true;
        for (int i = 0; i < arrayList.size() -1 ; i++) {
            if (!(arrayList.get(i) <= arrayList.get(i+1))){//si hay un par que no este en orden creciente se sale al momento
                ordenCreciente = false;
                System.out.println("");
                break;
            }

        }
        System.out.println(ordenCreciente);
        //sino esta en orden creciente, a lo mejor esta en orden decreciente
        boolean ordenDecreciente= true;
        if (!ordenCreciente) { // es lo mismo que if (ordenCreciente == false)
            //orden decreciente: para todos los elementos i tiene que ser >= i+1;
            for (int i = 0; i < arrayList.size() -1; i++) {
                if (!(arrayList.get(i)>=arrayList.get(i+1))){//si hay un par que no esta en orden decreciente, salgo
                    ordenDecreciente=false;
                    break;

                }

            }
        }
        //aqui ya sabemos si esta en orden creciente o decreciente o nada
        if(ordenCreciente){
            System.out.println("Esta ordenado de forma creciente");
        } else if (ordenDecreciente) {
            System.out.println("Esta ordenado de forma decreciente");
        } else {
            System.out.println("no esta ordenado");
        }

        //orden decreciente: para todos los elementos i tiene que ser
    }
}
