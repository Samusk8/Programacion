package volum5;

import java.util.Arrays;
import java.util.Scanner;

public class Task39 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos valores necesitas?");
        int longitud = teclado.nextInt();
        int[] valores = new int[longitud];
        for (int i = 1; i < valores.length+1 ; i++){
            System.out.println("escriba un numero:");
            int numero = teclado.nextInt();
            valores[i] = numero;
            int aux = valores[i];
            int media = (valores[i-1] + numero) / valores.length;
        }
        System.out.println(Arrays.toString(valores));

    }
}
