package Poo.Edificio;

/**
 * A partir de ahora el metodo main lo vamos a meter en una clase
 * que por convencion vamos a llamar Main
 */
public class Main {
    public static void main(String[] args) {
        //en el metodo main es donde creamos los objetos de las clase Edificio

        //para crear un objeto hacemos lo mismo que para las clases
        //de java SE: tipo (nombre de la clase) y el nombre que queramos dar al objeto
        //=
        //la palabra new y a continuacion la llamada al constructor y los argumentos (valores) del objeto que estamos
        //creando

        //edificio1: número de plantas = 4, área 2400,16, año de construcción = 1966.
        Edificio edificio1 = new Edificio(4,2400.16,1966);

        //tengo un edificio creado con esos valores. Si quiero ver cuales son podemos imprimirlos

        System.out.println("Plantas: " + edificio1.getNumeroPlantas() + ", Area " + edificio1.getArea() + " Año de construccion: "
                + edificio1.getAñoConstruccion());

        //edificio2: número de plantas = 6, área 3200,54, año de construcción = 2001.

        Edificio edificio2 = new Edificio(6,3200.54, 2001);
        System.out.println("Plantas: " + edificio2.getNumeroPlantas() + ", Area " + edificio2.getArea() + " Año de construccion: "
                + edificio2.getAñoConstruccion());


    }
}
