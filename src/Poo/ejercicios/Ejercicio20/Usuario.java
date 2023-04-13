package Poo.ejercicios.Ejercicio20;

public class Usuario {
    private final String username;
    private String email;
    private String password;

    private Estado estado;


    public Usuario (String username, String email, String password){
        //this.estado = Estado.PENDIENTE;
        this.username= username;
        this.email= email;
        this.password = password;
        this.estado= Estado.PENDIENTE;
    }
    public void cambiarEstado (Estado cambio){
        estado = cambio;
    }
    public Estado verEstado(){
        return this.estado;
    }
    public String mostrarDatos(){
        return "Mi username es " + username + " mi email " + email + " y mi password es " + password;

    }
    public void mensajeEstado(){
        if (this.estado == Estado.PENDIENTE){
            System.out.println("Tienes que esperar un poco");
        } else if (this.estado== Estado.ACTIVO) {
            System.out.println("Todo ok, vía libre");

        } else if (this.estado== Estado.BLOQUEADO){
            System.out.println("Usuario bloqueado. Algo habras hecho");
        } else {
            System.out.println("Estado desconocido");
        }

    }
   /* También en la clase Usuario crea un método mensajeEstado():void
El método hace lo siguiente:

• Si el estado es PENDIENTE, imprime "Tienes que esperar un poco".
• Si el estado es ACTIVO, imprime "Todo ok, vía libre".
• Si el estado es BLOQUEADO, imprime "Usuario bloqueado. Algo habrás
hecho".
• Si no es ninguno de estos estados, imprime "Estado desconocido".

Para probar este método mensajeEstado, ve al main y llama al método con el usuario creado.
A continuación, cambia el estado del usuario a ACTIVO, y vuelve a llamar al método
mensajeEstado.*/
}
