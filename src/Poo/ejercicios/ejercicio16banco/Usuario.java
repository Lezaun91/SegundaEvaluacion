package Poo.ejercicios.ejercicio16banco;

import java.util.Arrays;

public class Usuario {
    private String login;
    private String nombre;
    private String apellidos;

    private String[] cuentas;

    public Usuario(String login, String nombre, String apellidos, String[] cuentas) {
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuentas = cuentas;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLogin() {
        return login;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cuentas=" + Arrays.toString(cuentas) +
                '}';
    }
}
