package Poo.cajero;

import Poo.Ejemplos.herencia2.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gestor gestor1 = new Gestor("Antonio", 616468697);

        Gestor gestor2 = new Gestor("jorge", 687451212);

        gestor1.cambioImporteMaximo(10000);

        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("02672618H", "Victor", gestor1);//creo usuario

        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("02672618H", "Victor", gestor2);//creo usuario
        // cuentaCorriente1.dimeDatosGestor("Antonio", 616468697);//le asigno un gestor y un numero

        System.out.println(cuentaCorriente1.comprobarDinero(cuentaCorriente1.cantidadDinero()));//miro si tengo saldo suficiente, no se puede sacar

        System.out.println(cuentaCorriente1.mostrarInformacionCuenta());//muestra todos los datos de la cuenta 1 y el gestor 1

        System.out.println(cuentaCorriente2.mostrarInformacionCuenta());//muestra todos los datos

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto dinero quieres ingresar?");//pedimos dinero a ingresar

        cuentaCorriente1.aumentoSaldo(sc.nextDouble());//cantidad a aumentar

        System.out.println(cuentaCorriente1.mostrarInformacionCuenta());//mostramos la cantidad de dinero que tiene la cuenta

        System.out.println(cuentaCorriente1.comprobarDinero(cuentaCorriente1.cantidadDinero()));

        System.out.println("¿Cuanto dinero quieres retirar?");//pedimos dinero a retirar

        cuentaCorriente1.retirarDinero(sc.nextDouble());//cantidad a retirar

        System.out.println(cuentaCorriente1.mostrarInformacionCuenta());//mostramos informacion final de cuenta + el gestor añadido



        System.out.println();//hacemos un salto de línea


    }
}
