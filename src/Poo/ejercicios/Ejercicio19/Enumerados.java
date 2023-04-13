package Poo.ejercicios.Ejercicio19;

import java.util.Arrays;

public class Enumerados {
//    19. Crea un paquete enumerados y dentro de él una clase Enumerados, y en esta clase
//    crea estos enumerados:
//    a. Las estaciones del año

    enum Estaciones{ // EL NOMBRE DE LOS ENUMERADOS SE PONE COMO LAS CLASES, LA PRIMERA EN MAYUSCULA Y LAS DEMAS MINÚSCULAS
        PRIMAVERA, VERANO, OTOÑO, INVIERNO;// LOS VALORES DE LOS ENUMERADOS SE PONEN EN MAYUSCULA
    }
//    b. Las partes del día (mañana, mediodía, tarde, noche)

    enum PartesDelDia{
        MAÑANA, MEDIODIA, TARDE, NOCHE;

    }
//    c. Las comidas del día (desayuno, almuerzo, merienda, cena)

    enum Comidas{
        DESAYUNO, ALMUERZO, MERIENDA, CENA;
    }

    public static void main(String[] args) {
//    Añade un método main donde creas una variable de cada uno de estos tipos y le asignas
    Estaciones e = Estaciones.INVIERNO;
    PartesDelDia p = PartesDelDia.NOCHE;
    Comidas c = Comidas.CENA;

        System.out.println("Me encanta el " + e + " viciarme por la " + p + " y hincharme en la " + c );

        Estaciones[] estaciones = Estaciones.values();// con el metodo values puedo coger de golpe todos los valores del enumerado y
        //guardarlos en unn array
        PartesDelDia[] partesDelDia = PartesDelDia.values();
        Comidas[] comidas = Comidas.values();
        System.out.println(Arrays.toString(estaciones));
        System.out.println(Arrays.toString(partesDelDia));
        System.out.println(Arrays.toString(partesDelDia));

    }
//    un valor determinado y luego guardas en un array todas las constantes que contiene
//    cada uno de los enumerados, y muestras su contenido
}
