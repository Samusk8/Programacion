package volum4;

public class Task36 {
    public static void main(String[] args) {
        int Min = 2;
        int Max = 4;

        int[] array1 = new int [Min + (int)(Math.random() * ((Max - Min) + 1))];
        int[] array2 = new int [Min + (int)(Math.random() * ((Max - Min) + 1))];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Min + (int)(Math.random() * ((Max - Min) + 1));


            if (array1.length == 3){
                int aux;
                if (array1[0] >= array1[1]){
                    aux = array1[1];
                    array1[1] = array1[0];
                    array1[2] = aux;
                }
                if (array1[1] >= array1[2]){
                    aux = array1[2];
                    array1[2] = array1[1];
                    array1[1] = aux;
                }
                if (array1[0] >= array1[1]){
                    aux = array1[1];
                    array1[1] = array1[0];
                    array1[0] = aux;
                }
            }
            System.out.print(array1[i] + " ");

        }
        System.out.println();
    }
}
