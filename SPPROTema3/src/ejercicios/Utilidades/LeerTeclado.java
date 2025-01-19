package ejercicios.Utilidades;

import java.util.Scanner;

public class LeerTeclado {
    public static int leerTecladoInt() {
        int digito;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero");
        digito = teclado.nextInt();
        return digito;
    }
    public static double leerTecladoDouble() {
        double digito;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una Nota");
        digito = teclado.nextDouble();
        return digito;
    }
}
