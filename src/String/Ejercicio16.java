package String;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /* Escribe un programa que pida una lista de palabras (la guardas como una cadena de texto)*/

        String palabra = "";
        String cadena = "";
        do {
            System.out.println("Introduce palabra (0 para salir): ");
            palabra = sc.nextLine();
            //si la palabra no es 0, la concatenamos
            if (!palabra.equals("0"))
                cadena = cadena + palabra + " ";
        } while (!palabra.equals("0"));
        System.out.println(cadena);
       /* a continuación dé tres opciones:
        • Contar: pide una palabra, y me dice cuantas veces aparece en la lista
        • Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones
        de la primera por la segunda.
        • Eliminar: pide una , y la elimina de la lista.
        • Mostrar: muestra la lista de cadenas
        • Salir*/

        int opcion;
        do {
            System.out.println("Elige una opcion:\n1 Contar pide una palabra, y me dice cuantas veces aparece en la lista\n" +
                    "        \n2Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones" +
                    "        de la primera por la segunda.\n" +
                    "        \n3Eliminar: pide una , y la elimina de la lista.\n" +
                    "        \n4Mostrar: muestra la lista de cadenas\n" +
                    "        \n5 Salir*/");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    contar(cadena);
                    break;
                case 2:
                    cadena= modificar(cadena);
                    break;
                case 3:
                    cadena =eliminar(cadena);//como este metodo va a modificar la cadena que utilizamos en todo el ejercicio
                    //
                    break;
                case 4:
                    mostrar(cadena);//recojo la cadena modificada
                    break;
                case 5:
                    salir();
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }

        } while (opcion !=5);


    }

    public static void salir() {
    }

    public static void mostrar(String cadena) {
        //mostrar: muestra la lista de cadenas
        System.out.println(cadena);

    }

    public static String eliminar(String cadena) {
        System.out.println("Esta es la cadena: " + cadena);
        System.out.println("Palabra a eliminar");
        String palabra =sc.nextLine();
        if (cadena.contains(palabra)){
            cadena = cadena.replaceAll(palabra,"");//sustituye todas las apariciones de la palabra por ""

        }
        mostrar(cadena);
        return cadena;
    }

    public static String modificar(String cadena) {
        //modificar: pide una palabra, y a continuacion otro, y modifica todas las apariciones de la primera
        //por la segunda
        System.out.println("Escribe una de estas palabras: " + cadena);
        String palabra = sc.nextLine();
        System.out.println("¿con que otra palabra quieres remplazarla? ");
        String otraPalabra = sc.nextLine();
        cadena = cadena.replaceAll(palabra,otraPalabra);
        //mostramos el resultado
        mostrar(cadena);
        return cadena;
    }

    public static void contar(String cadena) {
        mostrar(cadena);
        System.out.println("¿Que palabra quieres contar? ");
        String contar= sc.nextLine();
        int contador = 0;
        ///***NEW*** -> EL METODO SPLIT me trocea una cadena y mete los trozos en un array ->mas facil de procesar
        String[] a= cadena.split(" ");//en la cadena el espacio me separa una palabra de otra
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(contar)){
                contador = contador + 1;
                System.out.println("la palabra apararece " + contador+ " veces");
            }
        }
        System.out.println("la palabra " + contar + " aparece " + contador + " veces");
    }
}
