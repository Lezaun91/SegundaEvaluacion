package String;

import java.util.Scanner;

public class Ejercicio10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*Ejercicio 10
        Pide una cadena y dos caracteres por teclado y sustituye la aparición del primer carácter en
        la cadena por el segundo carácter.*/


        reemplazarLetrasCadena();
    }
    public static String pedirCadena(){
        System.out.println("Introduce una cadena nueva");
        return sc.nextLine();
    }
    public static char pedirLetra(){
        System.out.println("Introduce una letra");
        return sc.next().charAt(0);
    }
    public static void reemplazarLetrasCadena(){
        String cadenaCambiada= pedirCadena().replace(pedirLetra(),pedirLetra());
        System.out.println(cadenaCambiada);

    }

}
