package Metodos;

import java.util.Scanner;

public class CosasDeAves {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      String ave = pedirAve();
      double peso = pedirPeso(ave);
      int edad = pedirEdad(ave);
      double racion = darSemillas(peso,edad);
      //vamos a imprimirla
        imprimeRacion(racion, ave);
    }
    //elige una ave

    public static String pedirAve(){
        System.out.println("¿que ave eres?");
        return sc.nextLine();
    }

    //crear tres metodos:

    //pide el peso del loro y lo devuelve
    public static double pedirPeso (String ave){
        System.out.println("Cuanto pesa" + ave + "?");
        double peso = sc.nextDouble();
        return peso;
    }
    //pide la edad del loro y lo devuelve
    public static int pedirEdad (String ave){
        System.out.println("¿Cuantos años tiene"+ ave + "?");
        int edad = sc.nextInt();
        return edad;
    }
    //calcula la cantidad de semillas que hay que darle, con esta formula:
    //(peso del loro/5) + edad del loro y la devuelve
    public static double darSemillas (double p, int e){
        double racion = (p/5) + e;
        return racion;
    }
        //imprime cuantas semillas tenemos que darle diariamente al loro
    public static void imprimeRacion(double r, String ave){
        System.out.println("¿Hay que darle? " + r + " semillas al " + ave + "?");
    }
}
