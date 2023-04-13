package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio20 {
    public static void main(String[] args) {
        /*20. Haz un programa que simule el siguiente juego de cartas: tenemos una baraja española.
        La barajamos y sacamos 10 cartas. Suma los puntos obtenidos.*/
        String[] palo ={"oros","copas","espadas","bastos"};
        String[] numero ={"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
        String[] baraja = new String[40];
        //rellenamos la baraja creado las cartas
        int posBaraja= 0;//este es el indice en el array baraja;lo hacemos avanzar cada vez que metemos una carta

            //mientras no llenemos la baraja, creamos una carta y se la añadimos
            for (int i = 0; i < palo.length; i++) {
                for (int j = 0; j < numero.length; j++) {
                    String carta = numero[j] + " de " + palo[i];
                    System.out.println(carta);
                    //añadimos la cara a la baraja
                    baraja[posBaraja] = carta;
                    posBaraja++;
                }
            }
        //System.out.println(Arrays.toString(baraja));
        //ahora tenemos que barajar


        ArrayList<String> mazo = new ArrayList<>();
        //ahora lo relleno con lo que tengo en el array baraja
        for (int i = 0; i <baraja.length ; i++) {
            mazo.add(baraja[i]);//metemos en el arraylist los elementos de baraja de uno en uno
        }
        //ahora si que podemos utilizar el metodo shuffle(), que me desordena los elementos del arraylist
        Collections.shuffle(mazo);
        System.out.println(mazo);

        //sacamos las 10 primeras cartas

        String[] mano = new String[10];
        for (int i = 0; i < mano.length ; i++) {
            mano[i]= mazo.get(i);

        }
        System.out.println(Arrays.toString(mano));
        //tenemos que crear un sumador
        int puntos = 0;
        for (int i = 0; i < mano.length; i++) {
            if (mano[i].startsWith("as")){
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
        System.out.println("Total de puntos " + puntos);
    }
}
