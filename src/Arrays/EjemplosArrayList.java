package Arrays;

import java.util.ArrayList;

public class EjemplosArrayList {
    public static void main(String[] args) {
        //int[] numeros = new int[10];
        ArrayList<String> nombre = new ArrayList<>();
        System.out.println(nombre.size());
        //añado elementos en la ultima posición
        nombre.add("Valentin");//index 0
        nombre.add("JavierA"); //index 1
        nombre.add("Claudia"); //index 2
        System.out.println(nombre.size());
        System.out.println(nombre);
        //podemos añadir un elemento en una posicion determinada
        nombre.add(1,"Rebeca");
        //para imprimirlo
        System.out.println(nombre);
        //quiero imprimir el ultimo nombre
        System.out.println(nombre.get(nombre.size() - 1));
        //Quiero imprimir el primer nombre
        System.out.println(nombre.get(0));
        //quiero reemplazar a JavierA por javier arreaza
        nombre.set(2, "Javier Arreaza");
        System.out.println(nombre);
        System.out.println(nombre.size());
        //quiero quitar un elemento
        nombre.remove("Valentin");
        System.out.println(nombre.size());
        System.out.println(nombre);

        //recorremos el Arraylist
        for (int i = 0; i < nombre.size(); i++) {
            nombre.set(i, nombre.get(i) + "s");
        }
        System.out.println(nombre);


    }
}
