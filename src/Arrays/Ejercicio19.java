package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio19 {

    static Scanner sc = new Scanner(System.in);//este Scanner funciona para toda la clase
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        /*19. Vamos a crear un programa que cree un array de números enteros (tamaño introducido
        por teclado), -> lo vamos a hacer con Arraylist -> no pedimos tamaño/*

         */






         /*muestre el siguiente menú y realice lo que en las opciones se indica:
        1. Añadir número al final: pide un número y lo añade al final del array.
        2. Añadir número en una posición: pide un número y una posición, y si la posición
        existe en el array lo añade en esa posición (la posición se pide a partir de 1).
        3. Longitud del array: muestra el tamaño del array.
        4. Eliminar el último número: muestra el último número del array y lo borra.
        5. Eliminar un número: pide una posición, y si la posición existe en el array borra el
        elemento que contiene (lo reemplaza con un 0).
        6. Contar números: pide un número y te dice cuántas veces aparece en el array.
        7. Posiciones de un número: pide un número y te dice en que posiciones está.
        8. Mostrar números: Muestra los números que contiene.
        9. Salir*/
        int opcion = 0;
        do {

            System.out.println( "1. Añadir número al final: pide un número y lo añade al final del array.\n" +
                    "2. Añadir número en una posición: \n" +
                    "3. Longitud del array: muestra el tamaño del array.\n" +
                    "4. Eliminar el último número: muestra el último número del array y lo borra.\n" +
                    "5. Eliminar un número: \n" +
                    "6. Contar números: pide un número y te dice cuántas veces aparece en el array.\n" +
                    "7. Posiciones de un número: pide un número y te dice en que posiciones está.\n" +
                    "8. Mostrar números: Muestra los números que contiene.\n" +
                    "9. Salir\n");
            opcion = sc.nextInt();

            switch (opcion){
                case 1->{
                    añadirNumeroAlFinal();
                    }
                case 8 ->{
                    mostrarNumeros();
                }
                case 3 ->{
                    longitudArray();
                }
                case 2  ->{
                    añadirNumeroPosicion();
                }

            }

        } while (opcion !=9);
    }

    public static void añadirNumeroPosicion() {
        System.out.println("Numero a añadir");
        int numero = sc.nextInt();
        System.out.println("Posicion en la que lo quieras añadir");
        int posicion = sc.nextInt();
        arrayList.add((posicion - 1), numero);
    }

    public static void longitudArray() {

    }

    public static void mostrarNumeros() {
        //aqui mostramos nuestros numeros
        System.out.println(arrayList);
    }

    public static void añadirNumeroAlFinal() {
        //aqui meto el codigo
        System.out.println("introduce numero a añadir: ");
        int numero = sc.nextInt();
        arrayList.add(numero);
    }
}
