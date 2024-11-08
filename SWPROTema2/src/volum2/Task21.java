package volum2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (numero % i==0){
                System.out.println(i);
            }
        }
    }
}
