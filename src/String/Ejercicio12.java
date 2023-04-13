package String;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*Ejercicio 12
        Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos
        cadenas se introducen por teclado.*/
        /*Scanner sc = new Scanner(System.in);
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();*/

        //tengo que ver si cadena2 esta dentro de cadena1

        boolean resultado = contenerSubcadena(pidecadena(), pidecadena());
        if(resultado){//resultado == true;
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }
    public static boolean contenerSubcadena(String cadena1, String cadena){
        boolean esta = false;
        if(cadena1.contains(cadena)){
            //System.out.println("si");
            return true;
        }
        return false;
    }
    public static String pidecadena(){
        Scanner sc = new Scanner(System.in);
        String cadena1 = sc.nextLine();
       // String cadena2 = sc.nextLine();
        return cadena1;
    }

}

