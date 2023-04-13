package Arrays;

import java.util.Arrays;

public class EjemplosArraysBidimensionales2 {
    public static void main(String[] args) {
        //declaramos un array de 3*4
        String[][] aula = {
                {"", "", "Valentin", "Rebeca"},
                {"Sara", "Gema", "Valeria", "Tatiana", "Claudia", "JavierA"},
                {"Antonio", "Cristian"},
                {"Jose Antonio", "Victor", "Daniel", "JavierB", "Jorge", "Aitor"},
                {"Miguel", "Alberto", "Francisco", "Roberto"}
        };
        for (int i = 0; i < aula.length; i++) {
            System.out.println(Arrays.toString(aula[i]));

        }
        System.out.println(aula[3][1]);
    }


}
