package Arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*10. Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
        diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para
        simplificarlo vamos a suponer que febrero tiene 28 días.*/
        Scanner sc = new Scanner(System.in);
        //vamos a controlar que se introduzca un numero valido
        int mes = 0;
        do {
            mes = sc.nextInt();
            System.out.println("Di un numero de mes (1-12) ");
        } while (mes <0 || mes >12);//Si falla seguimos preguntando.

        // array de meses con letras
        String[] nombreMes = {"E", "F","Mar", "A", "M","J", "JUL", "AG","S", "O","N","D"};


        //array de meses con los dias de cada mes
        int[] diasMes ={31,28,31,30,31,30,31,31,30,31,30,31};
        //los dos arrays van correlativos: el mismo indice indica nombre y dias que tiene el mes
        //si meto un 4 --> Abril tiene 30 dias, pero ojo el indice del mes 4 es 3 porque 0-1-2-3
        System.out.println(nombreMes[mes - 1] +" tiene " + diasMes[mes - 1]);
    }
}
