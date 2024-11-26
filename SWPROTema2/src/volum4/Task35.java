package volum4;

public class Task35 {
    public static void main(String[] args) {
        int Min = 2;
        int Max = 4;
        int[] array1 = new int[Min + (int)(Math.random() * ((Max - Min) + 1))];
        int[] array2 = new int[Min + (int)(Math.random() * ((Max - Min) + 1))];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i+1;
            System.out.print(array1[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i+1;
            System.out.print(array2[i] + "  ");
        }
        System.out.println();
        if (array1.length == array2.length){
            System.out.println("las dos array tienen la misma longitud");
        } else {
            System.out.println("las dos array no tienen la misma longitud");
        }
    }
}
