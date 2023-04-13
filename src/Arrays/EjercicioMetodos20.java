package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EjercicioMetodos20 {
    public static void main(String[] args) {
        /*20. Haz un programa que simule el siguiente juego de cartas: tenemos una baraja española.
        La barajamos y sacamos 10 cartas. Suma los puntos obtenidos.*/
        String[] baraja = crearBaraja();

        ArrayList<String> mazo = barajar(baraja);

        String[]mano = extraerMano(mazo);

        int puntos = sumarPuntos(mano);

        imprimir("baraja: ", baraja);

       //para imprimir dos arrays
        imprimir("Diez primeras cartas: ", mano);

        imprimir(mazo);

        imprimir(puntos);

        //sacamos las 10 primeras cartas



    }
    //metodo que crea una baraja y la devuelve








    public static String[] crearBaraja() {
        String[] palo = {"oros", "copas", "espadas", "bastos"};
        String[] numero = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
        String[] baraja = new String[40];
        //rellenamos la baraja creado las cartas
        int posBaraja = 0;//este es el indice en el array baraja;lo hacemos avanzar cada vez que metemos una carta

        //mientras no llenemos la baraja, creamos una carta y se la añadimos
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < numero.length; j++) {
                String carta = numero[j] + " de " + palo[i];
                //System.out.println(carta);
                //añadimos la cara a la baraja
                baraja[posBaraja] = carta;
                posBaraja++;
            }
        }


        return baraja;
    }

    //metodo que recibe una baraja y la devuelve barajada
    public static ArrayList<String> barajar(String[] baraja) {
        ArrayList<String> mazo = new ArrayList<>();
        //ahora lo relleno con lo que tengo en el array baraja
        for (int i = 0; i < baraja.length; i++) {
            mazo.add(baraja[i]);//metemos en el arraylist los elementos de baraja de uno en uno
        }
        //ahora si que podemos utilizar el metodo shuffle(), que me desordena los elementos del arraylist
        Collections.shuffle(mazo);

        return mazo;
    }
    //metodo que extrae las 10 primeras cartas de una baraja que recibe, y las devuelve
    public static String[] extraerMano(ArrayList<String> mazo){
        String[] mano = new String[10];
        for (int i = 0; i < mano.length; i++) {
            mano[i] = mazo.get(i);
        }
    return mano;
    }
    //metodo que recibe una mano de cartas y suma los puntos (los devuelve)
    public static int sumarPuntos (String[] mano){
        int puntos = 0;
        for (int i = 0; i < mano.length; i++) {
            if (mano[i].startsWith("as")) {
                puntos = puntos + 1;
            } else if (mano[i].startsWith("dos")) {
                puntos = puntos + 2;
            } else if (mano[i].startsWith("tres")) {
                puntos = puntos + 3;
            } else if (mano[i].startsWith("cuatro")) {
                puntos = puntos + 4;
            } else if (mano[i].startsWith("cinco")) {
                puntos = puntos + 5;
            } else if (mano[i].startsWith("seis")) {
                puntos = puntos + 6;
            } else if (mano[i].startsWith("siete")) {
                puntos = puntos + 7;
            } else if (mano[i].startsWith("sota")) {
                puntos = puntos + 10;
            } else if (mano[i].startsWith("caballo")) {
                puntos = puntos + 11;
            } else if (mano[i].startsWith("rey")) {
                puntos = puntos + 12;

            }
        }
        return puntos;

    }
    //sobreescribir el metodo imprimir: para imprimir un String[] (la baraja), para imprimir un ArrayList<String> (mazo)
    // y el resultado (los puntos)

    public static void imprimir(String mensaje, String[] array){
        System.out.println(mensaje + Arrays.toString(array));
    }
    public static void imprimir(ArrayList<String> mazo) {
        System.out.println("Mazo, barajada mezclada " + mazo);
    }
    public static void imprimir(int puntos) {
        System.out.println("Total de puntos:  " + puntos);
    }
}
