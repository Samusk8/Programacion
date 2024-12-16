package ejercicios;

import ejercicios.Utilidades.UtilidadesCosola;

import java.util.Scanner;

public class Task8 {

    //    Task 4
    public static boolean Pares(int numero) {
        boolean par = true;
        if (numero % 2 == 0) {
            return par;
        } else {
            par = false;
            return par;
        }
    }

    public static double media(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    public static void main(String[] args) {
        int numero = UtilidadesCosola.ReadInt("Introduce un número:    ");
        boolean par = Pares(numero);
        int a = numero;

        if (par) {
            System.out.println(numero + " es un numero par");

        } else {
            System.out.println(numero + " no es un numero par");
        }
        numero = UtilidadesCosola.ReadInt("Introduce un número:    ");
        par = Pares(numero);
        int b = numero;

        if (par) {
            System.out.println(numero + " es un numero par");

        } else {
            System.out.println(numero + " no es un numero par");
        }
        numero = UtilidadesCosola.ReadInt("Introduce un número:    ");
        par = Pares(numero);
        int c = numero;

        if (par) {
            System.out.println(numero + " es un numero par");

        } else {
            System.out.println(numero + " no es un numero par");
        }
        double media = media(a, b, c);
        System.out.println("La media es "+ media);

    }
}
