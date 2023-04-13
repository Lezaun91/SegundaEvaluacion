package Poo.Aviones;

import java.util.Arrays;

public class Avion {
    /*Ejemplo 2: la clase avión
    La clase avión describiría un avión abstracto para implementar después aviones
    concretos como tipos de objetos. A diferencia de la clase edificio, es fácil definir el
    comportamiento de un avión: puede volar y llevarnos de un sitio a otro del planeta.
    Todos los aviones comparten los siguientes atributos:
    - Nombre (un String, por ejemplo, “Airbus A320” o “Boeing 777”);
    - Aforo (un número entero);
    - Velocidad media (un número entero);
    - Coordenadas (necesarias para definir su posición).
      También tiene un comportamiento (método): llevar pasajeros de un punto geográfico a
      otro. Este comportamiento cambia el estado del avión.*/
    String nombreAvion;
    private int aforo;
    private int velocidadMedia;
    private double [] coordenada;

    public Avion(String nombreAvion, int aforo, int velocidadMedia, double[] coordenada){
        this.nombreAvion = nombreAvion;
        this.aforo =aforo;
        this.velocidadMedia = velocidadMedia;
        this.coordenada = coordenada;
    }
    public void llevarPasajeros (String ciudad, double [] coordenada){
        System.out.println("Nos vamos a " + ciudad);
        this.coordenada = coordenada;

    }

    @Override
    public String toString() {
        return nombreAvion + '\'' +
                ", aforo=" + aforo +
                ", velocidadMedia=" + velocidadMedia +
                ", coordenada=" + Arrays.toString(coordenada) +
                '}';
    }
    //metodo que imprime los atributos del avion
    public void  imprimir(){
        System.out.println(this.toString());
    }

    public String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getVelocidadMedia() {
        return velocidadMedia;
    }

    public void setVelocidadMedia(int velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public double[] getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(double[] coordenada) {
        this.coordenada = coordenada;
    }
}
