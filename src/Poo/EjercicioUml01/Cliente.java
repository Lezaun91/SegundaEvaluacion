package Poo.EjercicioUml01;

public class Cliente extends Persona {
    private String telefono;

    public Cliente(String nombre, int edad, String telefono){
        super(nombre, edad);
    }
    public void setTelefono(String telefono){
        this.telefono= telefono;
    }
    public String mostrarTelefono(){

        return "Este es mi nuevo telefono: " + telefono;
    }


}
