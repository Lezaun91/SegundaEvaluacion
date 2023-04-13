package Poo.Ejercito;

public class Caballero {
    private String nombre;
    private  int caballeros;
    private static int aumentoCaballeros = 1;


    public Caballero(String nombre){
        this.nombre= nombre;
        caballeros = aumentoCaballeros;
        aumentoCaballeros++;
    }
    public String devolverDatos(){

        return "El nombre del caballero es " + nombre + " y su numero de unidad es " + caballeros;
    }
    public  int devolverNumeroCaballeros(){

        return caballeros;
    }
}
