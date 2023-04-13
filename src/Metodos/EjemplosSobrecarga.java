package Metodos;

public class EjemplosSobrecarga {
    public static void main(String[] args) {

        imprimir("hola",5);//llamo al segundo metodo
        imprimir(5);
        imprimir("Hola");
        imprimir(5, "hola");

    }
    public static void imprimir(String s) {
        System.out.println(s);
    }
    public static void imprimir(String s, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(s);
        }
    }
    public static void imprimir(int veces, String s) {
        for (int i = 0; i < veces; i++) {
            System.out.println(s);
        }
    }
    public static void imprimir(int val) {
        System.out.println(val);
    }
}
