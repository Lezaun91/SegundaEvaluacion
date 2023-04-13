package Arrays;

public class Ejemplo03 {
    public static void main(String[] args) {
        /*Ejemplo 3. Uno más complicado: comprobar si un array está ordenado.
        El siguiente programa comprueba si el array dado está ordenado en orden ascendente
        e imprime "ORDENADO", de lo contrario imprime "DESORDENADO".*/
        int[] nums = {1,2,3,4,5,10,6};
        //declaramos una variable para indicar si esta ordenado (flag)
        boolean ordenado = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] <= nums[i+1]){
              //continue;
            } else {//si se mete aqui es que nums[1] es mayor que la siguiente -> esta desordenado
                ordenado = false;
                break;
            }
           //al finalizr el for es cuando
           }
        if(ordenado){
            System.out.println("ordenado");
        } else {
            System.out.println("Desordenado");
        }
    }
}
