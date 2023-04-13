package Poo.Ejercito;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creamos una unidad y vamos mostrando el contador
        Unidad u1 = new Unidad("Valentin");

        System.out.println(u1.devuelveDatos());

        Unidad u2 = new Unidad("Jorge.");

        System.out.println(u2.devuelveDatos());

        Unidad u3 = new Unidad("Javi B.");

        System.out.println(u3.devuelveDatos());

        Unidad u4 = new Unidad("Miguel");

        System.out.println(u4.devuelveDatos());

        Unidad u5 = new Unidad("Roberto");
        System.out.println(u5.devuelveDatos());

        //voy a crear una serie de caballeros y los meto en un arraylist
        Scanner sc = new Scanner(System.in);
        //ArrayList<Caballero> caballeros = new ArrayList<>();
        String caballeros [] = new String[3];
        for (int i = 0; i < caballeros.length; i++) {
            System.out.println("nombre caballero: ");
            Caballero caballero = new Caballero(sc.nextLine());
            System.out.println(caballero.devolverDatos());

        }

        General general1 = new General("Víctor");

        System.out.println(general1.devolverDatosGeneral());

        Medico medico1 = new Medico("Cristian");

        System.out.println(medico1.devolverDatosMedicos());

        System.out.println("el numero de unidades es " + u2.devolverNumeroUnidades() + " el numero de generales es " + general1.devolverNumeroGeneral() +
                " el numero de medicos es " + medico1.devolverNumeroMedicos() + " el numero de caballeros es " + caballeros.length) ;
    }
}
