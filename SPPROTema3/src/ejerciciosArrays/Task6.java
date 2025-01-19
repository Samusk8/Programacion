package ejerciciosArrays;

import java.util.Arrays;

public class Task6 {
    public static void ordenar(int[] array){
        int aux;
        boolean ordenable;
        if (array.length == 3){
            ordenable = true;
        } else {
            ordenable = false;
        }
        if (ordenable) {
            if (array[0] >= array[1]){
                aux = array[0];
                array[0] = array[1];
                array[1] = aux;
            }
            if (array[1] >= array[2]) {
                aux = array[1];
                array[1] = array[2];
                array[2] = aux;
            }
            if (array[0] >= array[1]){
                aux = array[0];
                array[0] = array[1];
                array[1] = aux;
            } else {

            }
        }


    }

    public static void main(String[] args) {
        int[] array = new int [3];
        array[0] = 7;
        array[1] = 3;
        array[2] = 9;
//        array[3] = 5;
        System.out.println(Arrays.toString(array));
        ordenar(array);
        System.out.println(Arrays.toString(array));

    }
}
