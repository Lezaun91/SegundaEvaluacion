package Poo.Ejercito;

public class General {
    private String nombre;
    private  int general;
    private static int aumentoGeneral = 1;

    public General (String nombre){
        this.nombre = nombre;
        general=aumentoGeneral;
        aumentoGeneral++;

    }
    public String devolverDatosGeneral(){

        return "El nombre del general supremo es " + nombre + " y solo hay " + general + " unico general";
    }
    public  int devolverNumeroGeneral(){

        return general;
    }
}
