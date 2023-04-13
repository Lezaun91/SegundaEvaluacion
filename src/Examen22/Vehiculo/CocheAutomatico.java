package Examen22.Vehiculo;

public class CocheAutomatico extends Coche{

    public CocheAutomatico(String matricula) {
        super(matricula);
    }
    public void frenar(int freno){

    }
    public void acelerar(int acelero){

    }

    @Override
    public String toString() {
        return "CocheAutomatico{" +
                "velocidad=" + velocidad +
                '}';
    }
}
