package String;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*Ejercicio 17
        Realiza una aplicación que solicite por pantalla una serie de números (salimos pulsando 0) y
        los guarde en una cadena de texto separados por un espacio. Por ejemplo, si el usuario
        introduce el 2, el 13 y el 235, el programa los almacena como “2 13 235” y lo pinta en la
        pantalla.*/
        //pasar de String a int EJ:



        /*String num = "15";
        String n2="16";
        System.out.println(num + n2);

        int a = Integer.parseInt(num);//si lo que quiero es sumarlos, los tengo que convertir a numero: Integer.parseInt ("15")
        int b = Integer.parseInt(n2);
        System.out.println(a + b);
        //y al reves: tengo un numero pero lo quiero convertir a String: Strung.valur0f(15)
        String cadena = String.valueOf(a);
        System.out.println(cadena);*/


        Scanner sc = new Scanner(System.in);
        int n = 0;
        String cadena ="";//declaro la cadena para ir metiendo los numeros que va a ir entrando
        do {
            System.out.println("numero: ");
            n= sc.nextInt();
            sc.nextLine();
            //para guardarlo en una cadena de texto, lo tengo que convertir a String
            //compruebo si es 0 y sino lo es, lo meto en la cadena
            if (n !=0){
                String num = String.valueOf(n);
                cadena = cadena + num + " ";

            }
            //añadirlo a una cadena
        }while (n!=0);
    }
}
