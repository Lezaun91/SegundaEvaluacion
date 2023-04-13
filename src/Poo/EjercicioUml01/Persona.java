package Poo.EjercicioUml01;

public class Persona {
   private String nombre;
   private int edad;

   public Persona(String nombre, int edad){
       this.nombre= nombre;
       this.edad= edad;
   }

   public String mostrarDatos(){

       return "Mi nombre es " + nombre + " y mi edad es " + edad;
   }

    @Override
    public String toString() {
        return "Mi nombre es "  + nombre +
                " y mi edad " + edad ;
    }
}
