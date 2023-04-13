package Poo.Ejercito;

public class Unidad {
    private  String nombre;

    private int unidades;
    private static int numeroUnidades = 1;

    public Unidad(String nom){
        nombre = nom;
        //cada vez que creamos una unidad incrementamos el contador de unidades
       // unidades++;// la principal utilidad de los atributos estaticos es esta, contar y aumentar
        unidades = numeroUnidades;
        numeroUnidades++;

    }
    public String devuelveDatos(){

        return "Mi nombre es " + nombre + " y  mi numero de unidad es " +  unidades;
    }
    public  int devolverNumeroUnidades(){
            unidades=numeroUnidades - 1;
        return unidades;
    }
}
