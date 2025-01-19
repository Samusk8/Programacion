package ejerciciosArrays;

import ejercicios.Utilidades.UtilidadesCosola;

public class Task3 {
    public static int[] arrayAleatoria(int longitud, int max, int min){
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int)(Math.random() * ((max - min) + 1));
        }
        UtilidadesCosola.ReadArray(array);
        return array;
    }

    public static void main(String[] args) {
        int max = 8;
        int min = 6;
        int longitud = 4;
        arrayAleatoria(longitud, max, min);
        arrayAleatoria(longitud, max, min);
        arrayAleatoria(longitud, max, min);
    }
}
