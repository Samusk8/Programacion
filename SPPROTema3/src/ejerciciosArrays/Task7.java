package ejerciciosArrays;

public class Task7 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        sumaCasillas(matriz);
        diagonal1(matriz);
        diagonal2(matriz);
    }
    public static void sumaCasillas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i + j) +1;
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void diagonal1(int[][] matriz) {
        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i +j) +1;
                if (matriz[i] == matriz[j]) {
                    System.out.print(matriz[i][j] + "  ");
                }
            }
        }
    }
    public static void diagonal2(int[][] matriz) {
        System.out.println();
        System.out.println("Diagonal secundaria:");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                matriz[x][y] = (x+y) + 1;
                if (x + y == matriz.length-1){
                    System.out.print(matriz[x][y]+ "  ");

                }
            }
        }
    }
}
