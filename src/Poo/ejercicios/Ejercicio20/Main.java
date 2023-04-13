package Poo.ejercicios.Ejercicio20;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String[] datos = pedirDatos(); // llama al metodo pedirDatos() y lo guarda

        Usuario usuario1 = new Usuario(datos[0],datos[1],datos[2]);
        System.out.println(usuario1.mostrarDatos());
        usuario1.mensajeEstado();
        System.out.println(usuario1.verEstado());
        usuario1.mensajeEstado();
        usuario1.cambiarEstado(Estado.ACTIVO);
    }

    public static String[] pedirDatos(){
        String[] datos = new String[3];
        System.out.println("Username");
        datos[0] = sc.nextLine();
        System.out.println("Email");
        datos[1] = sc.nextLine();
        System.out.println("Password");
        datos[2] = sc.nextLine();

        return datos;

    }

}
