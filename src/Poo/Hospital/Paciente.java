package Poo.Hospital;

import java.util.Arrays;
import java.util.Scanner;

public class Paciente {
    //atributos caracteristicas que queremos guardar de los pacientes
    private String nombre;
    private String apellidos;
    private String fechaNacimiento; //formato "DD/MM/AAAA"
    private int numeroHistorial; //codigo historial clinico paciente; >0
    private boolean alergias;// Si tiene alergias o no
    private String descripcionAlergias;// es un String con cada alergia separada por ;
    private String[] sintomas;

    public Paciente(String nombre, String apellidos, String fechaNacimiento, int numeroHistorial, boolean alergias, String descripcionAlergias, String[] sintomas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        //si el numero de historial es <=0 decimos que es incorrecto y asignamos el valor 999.999
        if(numeroHistorial<=0){
            System.out.println("El historial no puede ser negativo o 0");
            System.out.println("Porfavor introduzca un numero correcto");
            Scanner sc = new Scanner(System.in);
            this.numeroHistorial = sc.nextInt();

        }else {
            this.numeroHistorial = numeroHistorial;
        }
        this.alergias = alergias;
        this.descripcionAlergias = descripcionAlergias;
        this.sintomas = sintomas;
    }

    //Para que siga funcionando el constructor por defecto, una vez que tenemos uno declarado en la clase,
    //tenemos que escribirlo explicitamente

    public void organizarHistorialPaciente(int numeroHistorial){
        do {if(numeroHistorial<=0){
            System.out.println("El historial no puede ser negativo o 0, Porfavor introduzca un numero correcto");

        }else {
            this.numeroHistorial = numeroHistorial;
        }

        }while (numeroHistorial>=1);


    }
    public String devolverAlergiasDescripcionSintomas(){
        if (alergias){
            return "tiene alergia a " + alergias + " y su descripcion es " + descripcionAlergias;
        } else {
            return "No tiene alergia a nada";
        }
    }


    @Override
    public String toString() {

           return  "Paciente" +
                    "nombre='" + nombre +
                    ", apellidos='" + apellidos +
                    ", fechaNacimiento='" + fechaNacimiento +
                    ", numeroHistorial=" + numeroHistorial + "," +
                    devolverAlergiasDescripcionSintomas() +
                    ", sintomas=" + Arrays.toString(sintomas);

        }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(int numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    public boolean isAlergias() {
        return alergias;
    }

    public void setAlergias(boolean alergias) {
        this.alergias = alergias;
    }

    public String getDescripcionAlergias() {
        return descripcionAlergias;
    }

    public void setDescripcionAlergias(String descripcionAlergias) {
        this.descripcionAlergias = descripcionAlergias;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }
}
