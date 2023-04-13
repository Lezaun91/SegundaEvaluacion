package Poo.coche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
        Scanner sc = new Scanner(System.in);

        Coche coche2 = new Coche();

        System.out.println("Dime el color:");

        String color = sc.nextLine();

        coche2.estableceColor(color);

        System.out.println(coche2.dimeDatosGenerales());

        System.out.println(coche2.dimeColor());

        System.out.println("¿Tiene asientos de cuero?");

        String asientos = sc.nextLine();

        coche2.configurAsientos(asientos);

        System.out.println(coche2.dimeAsientos());

        System.out.println("¿Tiene Climatizador?");

        String climatizador = sc.nextLine();

        coche2.configurarClimatizador(climatizador);

        System.out.println(coche2.dimeClimatizador());

        System.out.println(coche2.dimePesoCoche());

        System.out.println("el precio del coche es: " + coche2.precioCoche());

        Furgoneta furgoneta1 = new Furgoneta(7, 580);

        furgoneta1.estableceColor("azul");

        furgoneta1.configurAsientos("si");

        furgoneta1.configurarClimatizador("si");

        System.out.println(furgoneta1.dimeDatosGenerales() + furgoneta1.dimeColor() + furgoneta1.dimeDatosFurgoneta());
    }
}
