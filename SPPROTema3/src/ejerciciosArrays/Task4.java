package ejerciciosArrays;

public class Task4 {
    public static boolean vectores(int[] vector1, int[] vector2){
        boolean iguales;
        if (vector1.length == vector2.length) {
            iguales = true;
        } else {
            iguales =false;
        }
        return iguales;
    }

    public static void main(String[] args) {
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = i;
        }
        for (int i = 0; i < vector2.length ; i++) {
            vector2[i] = i;
        }
        boolean iguales =
        vectores(vector1, vector2);
        if (iguales) {
            System.out.println("Los vectores tienen las misma longitud");
        } else {
            System.out.println("Los vectores no tienen la misma longitud");
        }
    }
}
