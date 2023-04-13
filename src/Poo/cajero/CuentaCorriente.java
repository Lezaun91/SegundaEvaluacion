package Poo.cajero;

import java.util.Scanner;

public class CuentaCorriente {

  /*  a. CuentaCorriente, que almacena los datos: DNI, nombre del titular y saldo. Las
    operaciones típicas con una cuenta corriente son:*/
    static String dni = null;
    public final String nombreTitular;
    private double saldo;
    private static String banco = "Santander";

    private Gestor empleado;

    public CuentaCorriente(String DNI){
        dni=DNI;
        this.nombreTitular = "";

        saldo= 0;
    }
    public CuentaCorriente(String DNI, String nombre, Gestor empleado){
        dni = DNI;
        nombreTitular= nombre;

        saldo = 0;
        this.empleado=empleado;
    }

    public CuentaCorriente(String DNI, String nombre){
        dni = DNI;
        nombreTitular = nombre;

        this.saldo = 0;
    }


    public String comprobarDinero (double saldo){
        if (saldo>0){
            return "Puede sacar dinero";
        } else {
            return "Saldo insuficiente";
        }
    }
    public void aumentoSaldo(double aumento){

        saldo = saldo + aumento;
    }
    public void retirarDinero(double disminucion){
        saldo = saldo - disminucion;
    }
    public double cantidadDinero(){
        return saldo;
    }
    public void  dimeBanco(String banco){
        CuentaCorriente.banco = banco;
    }
    public String mostrarInformacionCuenta(){

        return "Nombre: " + nombreTitular + " DNI: " + dni + " Saldo: " + saldo + " Banco: " + banco + " Datos Gestor: " +
                empleado.dameDatosGestor();
    }
    public void dimeDatosGestor(Gestor gestor1){
        empleado = gestor1;
    }

    /*Todas las cuentas corrientes con las que se va a trabajar pertenecen al
mismo banco. Añadir un atributo que almacene el nombre del banco
(que es único) en la clase CuentaCorriente. Diseñar un método que
permita recuperar y modificar el nombre del banco.
*/



}
