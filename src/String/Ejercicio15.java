package String;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*Ejercicio 15
        Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la
        cadena.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("cadena: ");
        String caden = sc.nextLine();
        System.out.println("caracter");
        char c = sc.nextLine().charAt(0);
        //cuantas veces aparece el caracter
        int contador = 0;
        for (int i = 0; i <caden.length() ; i++) {
            if(caden.charAt(i)==c){
                contador++;
            }
        }
        System.out.println(c + " aparece " + contador + " veces en " + caden);
    }
    //sacar parte del codigo al metodo contarCaracter, que recibe un String y un char y devuelve un int

    //sacar parte del codigo al metodo contarCarcer que recibe un string uy un char y devuelve un int

    //que imprima el resultado
}
