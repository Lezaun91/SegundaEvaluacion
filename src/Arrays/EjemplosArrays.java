package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class EjemplosArrays {
    public static void main(String[] args) {
        //declarar un array
        //tipo [] nombre;
        double[] elementos;
        //tambien double elementos[];

        //Inicializar -> instanciar = crear un objeto de tipo Array
        elementos = new double[5];

        //lo rellenamos
        elementos[0] = 10.8;
        elementos[1] = 14.3;
        elementos[2] = 13.5;
        elementos[3] = 12.1;
        elementos[4] = 9.7;


        //normalmente declaramos e inicializamos a la vez
        String[] diasLaborables = new String[5];
        diasLaborables[0] = "Lunes";
        diasLaborables[1] = "Martes";
        diasLaborables[2] = "Miercoles";
        diasLaborables[3] = "Jueves";
        diasLaborables[4] = "Viernes";
        //diasLaborables[5] = "Sabado";//este dara error en tiempo de ejecucion
        System.out.println(diasLaborables[4]);

        //hay un caso en que puedo no decir el tamaño, si lo relleno directamente

        String[] meses = {"ene", "Feb", "Mar", "Abril", "Mayo", "Jun", "jul", "Agos", "Sep", "Octu", "Nov", "Dic"};//en vez de new y tal pongo las llaves y dentro los valores separados por
        // comas
        //para imprimirlos
        //a)con for
        for (int i = 0; i < elementos.length; i++) {//ojo; en String era Lenght().
            System.out.println(elementos[i] + " ");

        }

        //b) otra manera con el metodo toString() de la clase Arrays
        System.out.println(Arrays.toString(diasLaborables));

        //c) con foreach -> es una variante simplificada del bucle for
        for (String mes : meses) {
            System.out.println(mes + " ");


            }


            // no funciona -> System.out.println(elementos);
            // no funciona -> System.out.println(diasLaborables);
            // no funciona -> System.out.println(meses);


            //para imprimirlos

        }
    }

