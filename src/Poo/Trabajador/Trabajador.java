package Poo.Trabajador;

import java.util.Date;
import java.util.GregorianCalendar;

public class Trabajador {

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Trabajador (String nombr, double sueld, int anyo, int mes, int dia){

        nombre = nombr;
        sueldo = sueld;
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
}
