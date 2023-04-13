package Examen22.Vehiculo;

public abstract class Vehiculo {
    private  String matricula;
    int velocidad;

    public Vehiculo(String matricula){
        this.matricula = matricula;
    }
    public abstract String dimeMatricula();

}

