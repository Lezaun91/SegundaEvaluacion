package Poo.ejercicios.ejercicio13libro;

public class Libro {
    /*13. Escribe una clase llamada Libro. Debe contener tres atributos: título, de tipo String,
    añoDePublicación, de tipo int y autores, de tipo array de String, y un constructor para
    inicializar los atributos. El orden de los parámetros en el constructor debe ser el
    mismo que el indicado en este enunciado.*/
    private String titulo;
    private int añoPublicacion;
    private String[] autores;

    public Libro(String titulo, int añoPublicacion, String[] autores) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.autores = autores;
    }
}
