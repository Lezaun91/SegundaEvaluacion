package Poo.Ejercito;

public class Medico {
    //. Atributos: nombre, médicos (int, estático).
    //ii. Constructor: recibe un nombre para el objeto creado e incrementa
    //cada vez el número de médicos.
    private String nombre;
    private int medicos;
    private  static int aumentoMedicos = 1;

    public Medico(String nombre){
        this.nombre= nombre;
        medicos= aumentoMedicos;
        aumentoMedicos++;
    }
    public String devolverDatosMedicos(){

        return "el nombre del medico es " + nombre + " y hay " + medicos + " medico";
    }
    public  int devolverNumeroMedicos(){

        return medicos;
    }
}
