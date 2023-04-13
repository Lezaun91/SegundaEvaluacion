package Examen22.Vehiculo;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String matricula) {
        super(matricula);
    }

    @Override
    public String dimeMatricula() {
        return null;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numeroPuertas=" + numeroPuertas +
                ", velocidad=" + velocidad + ", matricula" + dimeMatricula();
    }
}
