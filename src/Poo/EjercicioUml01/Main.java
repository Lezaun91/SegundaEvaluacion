package Poo.EjercicioUml01;

public class Main {
    public static void main(String[] args) {
        Directivo directivoCeo = new Directivo("Victor", 32);

        directivoCeo.setCategoria(Categoria.CEO);

        System.out.println( directivoCeo.mostrarDatos() + " " + directivoCeo.getCategoria());
    }


}
