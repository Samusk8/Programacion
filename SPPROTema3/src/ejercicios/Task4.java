package ejercicios;

import java.util.Scanner;

public class Task4 {
    public static boolean Pares(int numero) {
        boolean par = true;
        if (numero % 2 == 0) {
            return par;
        } else {
            par =false;
            return par;
        }
    }
    public static int LeerTeclado() {
        System.out.println("Escribe un número");
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        return numero;
    }

    public static void main(String[] args) {
        int numero = LeerTeclado();
        boolean par = Pares(numero);
        if (par) {
            System.out.println( numero +" es un numero par");

        } else {
            System.out.println(numero +" no es un numero par");
        }

    }

}
