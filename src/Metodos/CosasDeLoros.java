package Metodos;

import java.util.Scanner;

public class CosasDeLoros {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        imprimeRacionDiaria(darSemillas(pedirPeso(),pedirEdad()));
    }

    public static double pedirPeso (){
        System.out.println("Cuanto pesa el loro");
        double peso = sc.nextDouble();
        return peso;
    }
    //pide la edad del loro y lo devuelve
    public static int pedirEdad (){
        System.out.println("¿Cuantos años tiene el loro?");
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
    public static void imprimeRacionDiaria(double r){
        System.out.println("Hay que darle " + r + " semillas al loro al dia");
    }
}
