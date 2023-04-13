package Poo.cajero;

public class Gestor {
    public String nombre;
    public final int telefono;
    double importeMaximo;

    public Gestor(String nom, int tele){
        nombre = nom;
        telefono= tele;
        this.importeMaximo= 10000;
    }
    public void cambioImporteMaximo (double cambio){

        importeMaximo = importeMaximo + cambio;
    }
    public String datosCambioImporteMaximo (){

        return "El gestor ahora tiene un limite de: " + importeMaximo;
    }
    public String dameDatosGestor(){
        return  "El nombre del gestor es " + nombre + " El telefono es: " + telefono + " y su importe maximo es " + importeMaximo;

    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", importeMaximo=" + importeMaximo +
                '}';
    }
}
