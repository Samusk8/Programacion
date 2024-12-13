package ejercicios;

import java.util.Scanner;

public class Task2 {
    public static void simpatico(String nombre){
        System.out.println("Hola " + nombre);
    }

    public static void main(String[] args) {
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");

        simpatico(nombre = teclado.nextLine());
    }
}
