package Arrays;

import java.util.Scanner;

public class EjercicioExamen {
    public static void main(String[] args) {
        /*Realizar un programa que asigne una entrada en una sala de cine.
         El programa debe cumplir los siguientes requisitos:
        Pedir un día y un mes, y comprobar que es correcto. Consideramos que febrero tiene siempre 28 días.
        Si la fecha introducida no es correcta, se informa de ello y se vuelve a pedir un día y un mes,
        hasta que se introduzca una fecha adecuada.

        Si la fecha es correcta, se indica con un mensaje.

        A continuación, se muestra un mensaje como el siguiente, en el que se indica el mes con letras:

        Los asientos están representados por un array bidimensional de caracteres, de tamaño 4x4, donde una L indica que el asiento está libre, y una X indica que está ocupado. Inicialmente, algunos asientos están libres y otros ocupados:

        Se pide al usuario que indique fila y asiento, controlando que la respuesta esté dentro del rango:

        Una vez seleccionados fila y asiento, se comprueba si en esa posición el asiento está ocupado.
                Si el asiento está ocupado, se le indica y finaliza el programa.

        Si no lo está, se le asigna el asiento, se muestra de nuevo la sala con la nueva situación y finaliza el programa:*/
        //Scanner sc = new Scanner(System.in);
        //System.out.println("¿Que mes quiere ir?/*// \nEnero\nFebrero\nMarzo\nAbril\nMayo\nJunio\nJulio\nAgosto\nSeptiembre\nOctubre\nNoviembre\nDiciembre");*/
        //String nombreMes = sc.nextLine();
        //System.out.println("¿que dia quieres ir?");
        //int diaMes = sc.nextInt();

        //if (nombreMes.equals("Enero"|| "Marzo"||"Mayo"||"Julio" || "Agosto"|| "Octubre"|| "Diciembre")){
            Scanner sc = new Scanner(System.in);
       int dia = 0;
       int mes = 0;
        //creamos un array con los dias del mes
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean fechaCorrecta = false;
        do{
            System.out.println("Dia: ");
            dia = sc.nextInt();sc.nextLine();
            System.out.println("Mes: ");
            mes = sc.nextInt();sc.nextLine();
            if(mes >=1 && mes <=12 && dia >=1 && dia <= diasMes[mes-1]){
                ;
                //fechacorrecta para salir del bucle
                System.out.println("Fecha correcta");
                fechaCorrecta = true;
            } else{
                System.out.println("Fecha incorrecta. Por favor, vuelve a introducir la fecha.");
            }

        }while (!fechaCorrecta);//fecha correcta == false;


        // A continuacion, se muestra un mensaje como el siguiente en el que se indica el mes con letras.
        String[] meses ={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre",
        "noviembre","diciembre"};
        System.out.println("Asientos disponibles para el dia " + dia + " de " + meses[mes-1]);

        System.out.println("========================================================================");

       /* Los asientos están representados por un array bidimensional de caracteres, de tamaño 4x4, donde una L indica que el asiento está libre, y una X indica que está ocupado. Inicialmente, algunos asientos están libres y otros ocupados:

        Se pide al usuario que indique fila y asiento, controlando que la respuesta esté dentro del rango:

        Una vez seleccionados fila y asiento, se comprueba si en esa posición el asiento está ocupado.
                Si el asiento está ocupado, se le indica y finaliza el programa.*/
        char[][] asientos = new char[5][5];
        //ponemos todos los asientos libres
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j]= 'L';

            }

        }
        asientos[0][1] = 'X';
        asientos[1][1] = 'X';
        asientos[1][2] = 'X';
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length ; j++) {
                System.out.print(asientos[i][j] + "\t");

            }
            System.out.println();
        }
        //Se pide al usuario que indique fila y asiento, controlando que la respuesta esté dentro del rango:
        int fila = 0;
        do {
            System.out.println("Elige la fila (0-4): ");
            fila = sc.nextInt();
            if (fila < 0 || fila >4){
                System.out.println("Fuera de rango. Por favor, introduce un valor entre 0 y 4");
            }
        }while (fila<0||fila>4);

        int asiento = 0;
        do {
            System.out.println("Elige la asiento (0-4): ");
            asiento = sc.nextInt();
        /*    if (asiento <0 || asiento>4){
                System.out.println("Fuera de rango. Por favor, introduce un valor entre 0 y 4");
            }*/
        } while (asiento< 0||asiento> 4);

        if (asientos[fila][asiento] =='L'){
            asientos[fila][asiento] = 'X';
            for (int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos[i].length ; j++) {
                    System.out.print(asientos[i][j] + "\t");

                }
                System.out.println();
            }

        }else {
            System.out.println("El asiento esta ocupado. Tendras que empezar de nuevo.");
        }
    }
        }




