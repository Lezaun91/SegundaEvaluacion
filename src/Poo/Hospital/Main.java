package Poo.Hospital;

public class Main {
    public static void main(String[] args) {
        // creamos un PAciente llamando al constructor sin parametros

        Paciente valentin = new Paciente("valentin", "Preutesei", "08/02/2001", 1, false,"null",new String[]{"dolor de cabeza", "dolor tripa"});

        //imprimir los datos de este paciente

        //System.out.println(valentin);

        //para imprimir todos los atributos

        //System.out.println(valentin.toString());

        //podemos dar los valores a mano



        //creo el array de sintomas, lo relleno y luego se lo asigna al objeto.


        System.out.println(valentin);

        //ahora creamos otro paciente llamando al constructir parametrizado
        Paciente paciente2 = new Paciente("Daniel", "Martin Corpa","14/03/1976", 2, true, "pelo de animales;olivo;gramineas;aspirina",null);


    }
}
