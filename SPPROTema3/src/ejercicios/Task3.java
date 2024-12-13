package ejercicios;

import java.util.Scanner;

public class Task3 {
    public static void Pares(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par");
        } else {
            System.out.println(numero + " no es un nummero par");
        }
    }
    public static int LeerTeclado() {
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        return numero;
    }

    public static void main(String[] args) {
        int numero = LeerTeclado();
        Pares(numero);
    }
}
