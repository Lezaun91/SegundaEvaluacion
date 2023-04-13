package String;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*Ejercicio 6
        Escribe un programa que lea dos cadenas y las compare sin tener en cuenta los espacios en
        blanco. El programa debería imprimir true si son iguales, false en caso contrario.*/
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String cadena2 = sc.nextLine();
        cadena = cadena.replace(" ","");
        cadena2 = cadena2.replace(" ", "");
        /*if (cadena ==cadena2){
            System.out.println("es correcto");
        } else {
            System.out.println("esta mal");
        }*////esto es erroneo, no se puede comparar String

        //las comparo
        System.out.println("a) ¿Son iguales? : " + cadena.equals(cadena2));// distingiendo mayusculas y minusculas

        //si me da igual mayusculas o minusculas
        System.out.println("b) ¿Son iguales? : " + cadena.equalsIgnoreCase(cadena2));// distingiendo mayusculas y minusculas
    }
}
