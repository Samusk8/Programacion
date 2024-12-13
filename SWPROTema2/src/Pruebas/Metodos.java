package Pruebas;

public class Metodos {
    public static void main(String[] args) {
        int resultado = suma(6);
        System.out.println(resultado);
    }
    public static int suma(int numero){
        int suma = 0;
        for (int i = 1; i <= numero ; i++) {
            suma = i + suma;
        }
        return suma;
    }
}
