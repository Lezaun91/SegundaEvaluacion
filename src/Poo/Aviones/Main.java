package Poo.Aviones;

import Poo.Edificio.Edificio;

public class Main {
    public static void main(String[] args) {


        Avion avion1 = new Avion("Boeing 777", 509, 890, new double[]{41.40338,2.17403});
        avion1.imprimir();
        Avion avion2 = new Avion("AirbusA320", 250, 500, new double[]{41.38879, 2.15899});
        avion2.imprimir();

        //llevamos los pasajeros a su destino -> es simplemente cambiar coordenadas del avion
        avion1.llevarPasajeros("Barcelona", new double[]{41.38879, 2.15899});
        avion1.imprimir();

        //para probar la proteccion de paquete por defecto (sin modificador de acceso)
        //intentamos crear un Edificio (que esta en el paquete edificios)
        //desde la clase Main que esta en el paquete aviones

        //el edificion puedo crearlo tanto la clase como el constructor del efificio son publicos

    }

}
