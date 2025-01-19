package ejerciciosArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task5 {
    public static void ordenar(int[] array){
        int aux;
        if (array.length == 3) {
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


