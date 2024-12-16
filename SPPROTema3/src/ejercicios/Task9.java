package ejercicios;

import ejercicios.Utilidades.UtilidadesCosola;

import java.util.Scanner;


public class Task9 {
    public char LeerTeclado() {
        char opcion;
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.next().charAt(0);
        return opcion;
    }
    public void mayor2(int a, int b)  {
        if (a > b) {
            System.out.println(a +" es el mayor");
        } else if (b > a){
            System.out.println(b +" es el mayor");
        } else {
            System.out.println("los dos números son iguales :)");
        }
    }
    public void mayor3(int a, int b, int c)  {
        if (a >= b && a >= c) {
            System.out.println(a +" es  el mayor ");
        } else if (b > a && b >= c){
            System.out.println(b +" es el mayor");
        } else if (c > a && c > b){
            System.out.println(c +"es el mayor");
        }
    }
    public void relacion(int a, int b)  {
        if (a > b) {
            System.out.println(a +" es mayor que "+ b);
        } else if (b > a){
            System.out.println(b +" es mayor que "+ a);
        } else {
            System.out.println("los dos números son iguales :)");
        }
    }


    public static void main(String[] args) {
        Task9 task9 = new Task9();

        boolean acabar = true;
        do {
            System.out.println("Que quiere hacer?");
            System.out.println("a)  Encontrar el mayor entre 2 números");
            System.out.println("b)  Encontrar el mayor entre 3 números");
            System.out.println("c)  Mostrar la relación entre dos numeros");
            System.out.println("(Escribe la letra que corresponda a la opción)");
            char opcion = task9.LeerTeclado();
            if (opcion== 'a'){
                int numero = UtilidadesCosola.ReadInt("Escribe un numero:");
                int a = numero;
                numero = UtilidadesCosola.ReadInt("Escribe un numero:");
                int b = numero;
                task9.mayor2(a, b);
            } else if (opcion == 'b') {
                int numero = UtilidadesCosola.ReadInt("Escribe un numero:");
                int a = numero;
                numero = UtilidadesCosola.ReadInt("Escribe un numero:");
                int b = numero;
                numero = UtilidadesCosola.ReadInt("Escribe un numero:");
                int c = numero;
                task9.mayor3(a, b, c);

            } else if (opcion == 'c') {
                int numero = UtilidadesCosola.ReadInt("Escribe un numero:");
                int a = numero;
                numero = UtilidadesCosola.ReadInt("Escribe un numero:");
                int b = numero;
                task9.relacion(a, b);
            } else {
                System.out.println("seleccione una opcion válida");
            }
            String fin = UtilidadesCosola.ReadString("Desea finalizar? s/n  ");
            if (fin == "si"){
                acabar = false;
            } else {
                acabar = true;
            }
        } while (acabar == true);


    }
}
