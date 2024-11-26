package volum2;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        int numero;
        double resultado = 0;
        int intentos = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe un numero");
        numero = teclado.nextInt();
        while (numero!= 0) {
            resultado = resultado +numero;
            intentos++;
            System.out.println("escribe un numero");
            numero = teclado.nextInt();
        }
        resultado = resultado / intentos;
        System.out.println("la media es "+resultado);
    }
}
