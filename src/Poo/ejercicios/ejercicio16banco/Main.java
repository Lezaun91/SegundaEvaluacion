package Poo.ejercicios.ejercicio16banco;



public class Main {
    public static void main(String[] args) {
       /* c. Crea una clase Main con:
        i. un método main dentro del cual debes crear:
        1. Una instancia de la clase Usuario llamada propietario ((login:
        “demo”, nombre: “Ale”, apellidos “Chim Pom”)
        2. Una instancia de la clase Cuenta (“123456”, 1000, propietario).
        ii. Un método estático mostrarCuenta, que decibe una cuenta y
        muestra toda la información de la cuenta.*/

        Usuario propietario = new Usuario("demo", "Ale", "Chim Pom", new String[]{"01234568x", "123566887p"});

        Cuenta cuenta1 = new Cuenta("123456", 1000, propietario);

        //System.out.println(mostrarCuenta(cuenta1));
       mostrarCuenta(cuenta1);
    }
        public static void mostrarCuenta(Cuenta cuenta1){
            //provechamos que tenemos un método de instancia en la clase cuenta que imprime
            //valores de los atributos
            System.out.println(cuenta1.toString());
        }
}
