package ejercicios.Utilidades;

import java.util.Scanner;

public class UtilidadesCosola {
    public static int ReadInt(String mensaje){
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    public static double ReadDouble(String mensaje){
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        return teclado.nextDouble();
    }
    public static String ReadString(String mensaje){
      Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        return teclado.nextLine();
    }

    public static void main(String[] args) {
//    int quantitatNotes=UtilitatsConsola.llegirSencer("Nombre de notes: ");
    }
}
