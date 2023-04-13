package Poo.Trabajador;

public class Main {
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador("antonio", 85000, 1991,5,10);

        trabajador1.subirSueldo(5);
        System.out.println("El nombre es :" + trabajador1.dameNombre() + " sueldo = " + trabajador1.dameSueldo() + " fecha alta " + trabajador1.dameFechaContrato());
    }
}
