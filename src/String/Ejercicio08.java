package String;

import java.util.Scanner;

/** @uthor Victor*/
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        cadena = cadena.toUpperCase();
       System.out.print(cadena.charAt(0));
        //System.out.print(cadena.substring(0,1));//otra forma de sacar el primer caracter
        //tengo que extraer las iniciales
        for (int i = 0; i <cadena.length() ; i++) {
            if(cadena.charAt(i) == ' '){
                System.out.print(cadena.charAt(i+1));

            }
        }
        System.out.println(cadena);

    }
}
