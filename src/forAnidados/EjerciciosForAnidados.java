package forAnidados;

import java.util.Scanner;

/**
 * Estos ejercicios estan en la hoja de ejercicios de estructuras de control de la primera evaluación
 */
public class EjerciciosForAnidados {
    //utilizamos un scanner static
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //muestro el menu
        String otroEjercicio = "";
        do {
            int ejercicio = menu(); //en la variable ejercicio tengo el numero
            //con un switch segun me hayan indicado un ejercicio u otro ejercicio lo ejecuta
            switch (ejercicio) {
                case 27:
                    ejercicio27();//llamamos al metodo donde esta desarrollado el ejercicio27
                    break;
                case 28:
                    ejercicio28();
                    break;
                case 29:
                    ejercicio29();
                    break;
                case 35:
                    ejercicio35();
                    break;
                default:
                    System.out.println("Este ejercicio no entra aqui");
            }
            System.out.println("¿Quieres hacer otro ejercicio? (S/N?");
            otroEjercicio =sc.nextLine().substring(0,1);//cogemos solamente la primera letra, por si alguien pone si o no

        }while (otroEjercicio.equalsIgnoreCase("S"));

    }

    private static void ejercicio35() {
        String enunciado = "Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,\n" +
                "siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo,\n" +
                "para n = 5:";
        System.out.println(enunciado);
        System.out.println("introduce un numero");
        int numero = sc.nextInt();
        sc.nextLine();
        int reduccion = 1;
        int resta = 0;
        System.out.println("introduce un caracter");
        char c = sc.nextLine().charAt(0);
        for (int i = 0; i <numero ; i++) {
            for (int j = 0; j < resta; j++) {
                System.out.print(c + "\t");
            }
            resta = numero - reduccion++;
            System.out.println();
        }

    }

    private static void ejercicio29() {
        String enunciado = "Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de\n" +
                "multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas\n" +
                "puedes usar el tabulador \\t). Ejemplo:";
        System.out.println(enunciado);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        sc.nextLine();
        int multi = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print("tabla del " + (i) + ": ");
            for (int j = 1; j <= 10; j++) {
                multi = (i) * (j);
                System.out.print(multi + " ");
            }
            System.out.println();
        }
    }

    private static void ejercicio28() {
        String enunciado = "Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un\n" +
                "rectángulo en que la base sea el número mayor y la altura el número menor, con un\n" +
                "carácter también introducido por teclado.";
        System.out.println(enunciado);
        System.out.println("Introduce a: ");
        int a = sc.nextInt();
        System.out.println("Introduce b: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("introduce un caracter");
        char c = sc.nextLine().charAt(0);
        //ahora tengo que ver cual es la base (el numero mayor)
        int base;
        int altura;
        if(a>b){
            base=a;
            altura=b;
        } else {
            base = b;
            altura = a;
        }
        //en base tengo ya el numero mayor y en altura el menor
        //ahora pinto el rectangulo
        //tantas filas como sea altura -> i (for externo)
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(c + "\t");
            }
            //cada vez que termino de pintar una fila, meto un salto de linea
            System.out.println();
        }
    }

    private static void ejercicio27() {
        String enunciado = "27. Escribe un programa que, dado un número n introducido por teclado, dibuje un\n" +
                "cuadrado de dimensiones n * n, con un carácter también introducido por teclado.";
        System.out.println(enunciado);
        //resolvemos este ejercicio
        System.out.println("introduce un numero: ");
        int n = sc.nextInt();
        sc.nextLine();//por precaucion
        System.out.println("Introduce un caracter");
        char c = sc.nextLine().charAt(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c + "\t");
            }
            //cada vez que finalize el bucle intero meto un salto de linea
            System.out.println();
        }
    }

    //un metodo menu que pregunta que ejercicio quieres hacer: 27, 28, 29 o 35
    //y devuelve el numero de ejercicio a realizar
    public static int menu(){
        System.out.println("¿Que ejercicio quieres hacer?\n27\n28\n29\n35");
        int ejercicio = sc.nextInt();
        //ponemos despues de sc.nextint() esto para que no haga el salto de linea puñetero
        sc.nextLine();
        return ejercicio;
    }
}
