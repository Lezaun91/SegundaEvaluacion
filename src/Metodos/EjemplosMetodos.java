package Metodos;

import java.util.Scanner;

public class EjemplosMetodos {
    //podemos declarar un scanner estatico oara utilizarlo en toda la clase
    //y asi no tengo que declarar un Scanner en otro metodo

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //a los otros metodos los llamamos desde aqui
        String nombre = pideNombre(); //pideNombre() devuelve un String; ese String lo guardo en una variable

        //quiero utilizar el metodo imprimeNombre para imprimir la variable nombre
        //Llamo al metodo imprimeNombre

        //imprimeNombre("Victor");//llamo al metodo imprimeNombre con el argumento "Victor"
        imprimeNombre(nombre);
        //int longitud = nombre.length();// esto es llamar o invocar el metodo lenght()
        System.out.println();
        imprimeLongitud(nombre);
    }

    //Dentro de la clase pero fuera del main, escribimos los otros metodos
    //public static tipoDevuelve nombreDelMetodo(parametros o no){
    //intrucciones que se ejecutan al llamar o invocar al metodo y cerramos llave}

    //declaracion del metodo:

    //declara un metodo que no reciba nada, pregunta un nombre y lo devuelve
    public static String pideNombre(){
        System.out.println("Nombre: ");
        //cuando devuelve algo hay que poner return
        return sc.nextLine();

    }
    public static void imprimeNombre(String n){//del parametro tengo que poner el tipo y el nombre que yo quiera
        System.out.println(n);

        }
    //declara un metodo que reciba un String e imprima su longitud
    public static void imprimeLongitud(String l){
        System.out.println("La longitud del nombre es " + l.length());
    }

}
