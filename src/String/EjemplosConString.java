package String;

import java.util.Scanner;

public class EjemplosConString {
    public static void main(String[] args) {
        String cadena = new String ("hola");//esto se puede poner asi, pero es muy largo
        String cadena2 = "hola";//String es el unico tipo referencia en que te puedes esaltar el new al crear una variable de este tipo

        Scanner sc = new Scanner(System.in);
        String ejemplo = "esternocleidomastoideo";
        //podemos acceder a sus caracteres indicando ek indice (la posicion) en la que estan
        System.out.println(ejemplo.charAt(0));// es la letra que esta en la posicion 0 de palabra ('la 1')
        System.out.println(ejemplo.charAt(10));// es la letra que esta en la posicion 10 en la palabra pero CUIDADO EL 0 cuenta.

        //Metodos
        //Para saber la longitud del String
        System.out.println("********************************************");
        System.out.println("******      METODOS CON STRING     *********");
        System.out.println("********************************************");
        System.out.println("longitud: " + ejemplo.length());
        System.out.println("¿Esta vacia?" + ejemplo.isEmpty());
        String vacia = " ";
        System.out.println("¿Esta vacia?" + vacia.isEmpty());
        System.out.println("Todo en mayusculas: " + ejemplo.toUpperCase());
        System.out.println("Todo en minisculas: " + ejemplo.toLowerCase());
        System.out.println("¿Termina con \"cleta\"?" + ejemplo.endsWith("cleta"));
        System.out.println("¿Termina con \"cleideo\"?" + ejemplo.endsWith("cleideo"));
        System.out.println("¿Empieza con \"pla\"?" + ejemplo.startsWith("pla"));
        System.out.println("¿Contiene \"cleido\"?" + ejemplo.contains("cleido"));
        System.out.println("Subcadena: " + ejemplo.substring(3 , 8));//posicion final le tienes que decir una mas que la que quieres
        System.out.println("Sustituye e por una i: " + ejemplo.replace("e", "i"));
        String conEspacios = "     tititi      ";
        System.out.println("longitud: " + conEspacios.length() + "String " + conEspacios);
        String sinEspacios = conEspacios.trim();
        System.out.println("longitud: " + sinEspacios.length() + "String: " + sinEspacios);
        System.out.println("comparar con equalsIgnoreCase");
        String minusculas = "segunda";
        String mayusculas = "SEGUNDA";
        System.out.println("con equals: " + minusculas.equals(mayusculas));
        System.out.println("con equalsignoreCase: " + minusculas.equalsIgnoreCase(mayusculas));

        //tamaño de un String
        String str = "hola";
        System.out.println("tamaño = " + str.length());
        System.out.println("ultimo caracter del string: " + str.charAt(str.length() -1));

        //Eliminar espacios en blanco
        String frase = "El examen es el lunes";
        frase = frase.replace(" ", "");
        System.out.println(frase);




    }
}
