package Poo.EjercicioUml01;

import java.util.ArrayList;

public class Directivo extends Empleado {
    private Categoria categoria;
    private ArrayList<Empleado> empleados;

    public Directivo(String nombre, int edad) {
        super(nombre, edad);

    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {

        return "La categoria del directivo es: " + categoria;
    }

    public String mostrarDatosDirectivo (){

        return "super.mostrarDatos() +  ";
    }
}
