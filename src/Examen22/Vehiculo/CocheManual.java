package Examen22.Vehiculo;

public class CocheManual extends Coche{
    private int marcha;

    public CocheManual(String matricula) {
        super(matricula);
    }
    public void cambiarMarcha(int cambio){

    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    @Override
    public String toString() {
        return "CocheManual{" +
                "marcha=" + marcha +
                ", velocidad=" + velocidad +
                '}';
    }
    public void frenar(int freno){

    }
    public void acelerar(int acelero){

    }
}
