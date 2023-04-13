package Poo.coche;

public class Furgoneta extends Coche {


    private int capacidadCarga;

    private int plazasExtras;

    public Furgoneta(int plazasExtras, int capacidadCarga){

        super(); //llama al constructor de la clase padre

        this.capacidadCarga = capacidadCarga;

        this.plazasExtras = plazasExtras;
    }

    public String dimeDatosFurgoneta(){

        return  "La capacidad de carga es : " + capacidadCarga + " y la plazas son: " + plazasExtras;
    }
}
