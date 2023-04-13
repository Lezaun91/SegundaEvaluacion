package Arrays;

public class Ejercicio24 {
    public static void main(String[] args) {
       /* 24. Crea un progama que :
•
• Carga la tabla con dos únicos valores: 0 y 1, donde el valor 1 ocupará las
        posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras
        que el resto de los elementos contendrán el valor 0.
• Visualiza el contenido de la matriz en pantalla.
        111111111111111
        100000000000001
        100000000000001
        100000000000001
        111111111111111*/

        //Declara una tabla de números, bidimensional, de tamaño 5x15 y nombre ‘marco’.
        int [][] marco = new int[5][15];
        //lo rellenamos asi
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if(i==0|| i == 4 ||j==0 || j==14){//en la fil 0 y 4, y en la columna 0 y 14 meto un 1
                    marco[i][j] = 1;
                }else {
                    marco[i][j] = 0;
                }

            }

        }


        //lo pintamos al final
        for (int k = 0; k < 5; k++) {//5 tambien lo podria poner asi: i <tabla.length
            for (int y = 0; y < 15; y++) {//15 tambien lo podria poner asi table [i].lenght
                System.out.print(marco[k][y] + "\t");
            }
            System.out.println();
        }
    }
}
