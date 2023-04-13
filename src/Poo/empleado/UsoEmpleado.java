package Poo.empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {
    public static void main(String[] args) {
    /*Empleado empleado1 = new Empleado("Antonio", 85000,1990, 12, 17);

    Empleado empleado2 = new Empleado("jorge",25000,1992,11,27);

    Empleado empleado3 = new Empleado("paco",33000,1999,07,27);

    empleado1.subirSueldo(5);

    empleado2.subirSueldo(5);
        System.out.println("nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de alta: " + empleado1.dameFechaContrato());

        System.out.println("nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha de alta: " + empleado2.dameFechaContrato());*/

        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Antonio", 85000,1990, 12, 17);
        misEmpleados[1] = new Empleado("jorge",25000,1992,11,27);
        misEmpleados[2] = new Empleado("paco",33000,1999,07,27);

      /*  for (int i = 0; i < misEmpleados.length; i++) {

            misEmpleados[i].subirSueldo(5);

        }*/
        for(Empleado nuevaForma: misEmpleados){
            nuevaForma.subirSueldo(5);
        }

       /* for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() +
                     " sueldo: " + misEmpleados[i].dameSueldo() +
                    " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());

        }*/
        for (Empleado imprimeNuevo:misEmpleados) {
            System.out.println("Nombre: " + imprimeNuevo.dameNombre() +
                    " sueldo: " + imprimeNuevo.dameSueldo() +
                    " Fecha de Alta: " + imprimeNuevo.dameFechaContrato());

        }
    }
    static class Empleado{

        public Empleado(String nom, double sue, int anyo, int mes, int dia){

            nombre = nom;
            sueldo = sue;
            GregorianCalendar calendario = new GregorianCalendar(anyo,mes-1,dia);
            altaContrato = calendario.getTime();
        }

        public String dameNombre(){//GETTER

            return nombre;
        }
        public double dameSueldo(){//GETTER

            return sueldo;
        }
        public Date dameFechaContrato(){//GETTER

            return altaContrato;
        }

        public void subirSueldo(double porcentaje){//SETTER

            double aumento = sueldo * porcentaje/100;

            sueldo = sueldo + aumento;

        }

        private String nombre;
        private double sueldo;
        private Date altaContrato;

    }
    class Jefe extends UsoEmpleado{
        public Jefe(String nom, double sue, int anyo, int mes, int dia) {
            super();
        }
    }
}
