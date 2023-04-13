package prueba;

import java.util.Scanner;

public class Prueba {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       /* Escribir un programa que elabore el ticket de entrada según la edad del espectador. Si el espectador es
        mayor de edad se considera que es adulto y paga 4 €. Los menores pagan 2 €.
                Trata de adaptarte en la medida de lo posible a esta estructura:
        • pedirEdad(): pregunta la edad y devuelve la respuesta en
        años.
        • devolverTipo(int edad): recibe la edad en años y devuelve
        “Adulto” o “Niño “.
        • calcularPrecio(String tipo): recibe el tipo de entrada y
        devuelve el precio en euros.
        • imprimirTicket(String tipo, int precio): imprime el ticket indicando el tipo de entrada y el precio.*/

        int edad = pedirEdad();
        /*String tipo = devolverTipo(edad);
        int precio = calcularPrecio(tipo);*/
        imprimirTicket(devolverTipo(edad),calcularPrecio(devolverTipo(edad)));

    }
    public static int pedirEdad(){
        System.out.println("¿edad?");
        int edad = sc.nextInt();
        return edad;
    }
    public static String devolverTipo(int edad){
        String tipo = "";
        if (edad>=18){
            return "Adulto";
        } else {
            return "Niño";
        }
    }
    public static int calcularPrecio(String tipo){
        int precio = 0;
        if (tipo.equalsIgnoreCase("Adulto")){
            return  4;
        } else {
           return 2;
        }
    }
    public static void imprimirTicket (String tipo, int precio){
        System.out.println("-----------------------------");
        System.out.println("|    TICKET DE ENTRADA      |");
        System.out.println("| " + tipo + "          precio: " + precio + "  €|" );
        System.out.println("-----------------------------");
    }
}
