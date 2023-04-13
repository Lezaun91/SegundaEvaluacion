package Examen22;

import java.util.Scanner;

public class Ejercicio01 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String salir ="";
        do {
            String codigo = pedirCodigo();
            //comprobamos si el codigo es correcto
            if(codigo.length() != 8 && codigo.length() != 11){
                System.out.println("El numero de caracteres introducidos (" + codigo.length() +") no es correcto.\nUn codigo SWIFT " +
                        "tiene 8 u 11 caracteres");
            } else {
                String pais =codigo.substring(4,6);
                System.out.println(pais);
                String localidad = codigo.substring(6,8);
                if (localidad.equals("MM") && pais.equals("ES")){
                    System.out.println(" localidad: Madrid");
                } else if (localidad.equals("MM") && pais.equals("RU")){
                    System.out.println(" localidad: Moscu");
                } else {


                }
            }
            System.out.println("¿Quieres salir?");
            salir = sc.nextLine();
        } while (salir.equalsIgnoreCase("no"));
    }
    public static String pedirCodigo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pide un codigo");
        String codigo = sc.nextLine();
        return codigo;
    }
    public static void devolverCodigo(String codigo){

    }
}
