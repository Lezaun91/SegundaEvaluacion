package Poo.ejercicios.Robot;

public class Robot {
    /*14. Crea una clase Robot con dos atributos de tipo String: nombre y modelo, y un
    atributo int duración.
    Añade tres constructores:
            • Un constructor sin parámetros que cree objetos de nombre “Anónimo” y modelo
“Desconocido” (no modifica el valor por defecto de duración).
            • Un constructor con (tres) parámetros que, recibe valores e inicializa canda uno de los
    tres atributos de los objetos que se crean.
            • Un constructor con (dos) parámetros que recibe por parámetro nombre y modelo al
    crearse un objeto. En el cuerpo del constructor invocamos al constructor de tres
    parámetros, con el nombre y modelo recibidos y una duración de 20 años.
    Crea en el mismo fichero una clase Main en la cual creamos tres robots, uno con cada
    constructor, y mostramos sus propiedades.*/
  String nombre;
     String modelo;
     int duracion;

    //3 constructores

    //
    public Robot(){
        this.nombre = "Anonimo";//cuando uso este constructor de nombre es este
        this.modelo = "Desconocido";
       //duracion se queda como esta, es decir, con valor 0
    }

    public Robot(String nombre, String modelo, int duracion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duracion = duracion;
    }
    public Robot (String nombre, String modelo){
        this(nombre, modelo, 20);//llamada a otro constructor, concretamente no duce que al de tres parametros


    }
}
