package ejerciciosArrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array =new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        ejercicios.Utilidades.UtilidadesCosola.ReadArray(array);
    }
}
