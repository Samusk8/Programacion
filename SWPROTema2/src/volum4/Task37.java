package volum4;

public class Task37 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                matriz[x][y] = x+y;

                    System.out.print( matriz[x][y] + "  ");

            }
            System.out.println();
        }
        System.out.println("Diagonal principal:");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                matriz[x][y] = x+y;
                if (matriz[x] == matriz[y]){
                    System.out.print( matriz[x][y] + "  ");
                }
            }
        }
        System.out.println();
        System.out.println("Diagonal secundaria:");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                matriz[x][y] = x+y;
                if (x + y == matriz.length-1){
                    System.out.print(matriz[x][y]+ "  ");

                }
            }
        }







//        int[] matriz = new int[16];
//        Esto es una chapuza pero funciona para este caso :)
//        for (int i = 0; i < 4; i++) {
//            matriz[i] = i;
//            System.out.print(matriz[i] + "  ");
//        }
//        System.out.println();
//        for (int i = 1; i < 5; i++) {
//            matriz[i] = i;
//            System.out.print(matriz[i] + "  ");
//        }
//        System.out.println();
//        for (int i = 2; i < 6; i++) {
//            matriz[i] = i;
//            System.out.print(matriz[i] + "  ");
//        }
//        System.out.println();
//        for (int i = 3; i < 7; i++) {
//            matriz[i] = i;
//            System.out.print(matriz[i] + "  ");
//        }
    }
}
