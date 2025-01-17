package ejercicios.Ordenacion;

import ejercicios.Utilidades.NumeroAleatorio;
import ejercicios.Utilidades.OrdenacionBusqueda;
import ejercicios.Utilidades.UtilidadesCosola;

import java.util.Arrays;

public class Pruebas {
    public static void pruebaOrdenacion(){
        System.out.println("Ordenar Array mediante Metodo Burbuja");
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = NumeroAleatorio.aleatorio();
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        OrdenacionBusqueda.burbuja(array);
        System.out.print(Arrays.toString(array));
        System.out.println();
    }
    public static void pruebaInsertSort(){
        System.out.println("Ordenar Array mediante Insert Sort");
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = NumeroAleatorio.aleatorio();
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        OrdenacionBusqueda.insertSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
    public static void pruebaBusquedaBinaria(){
        System.out.println("Buscar valores en una array");
        int[] array = new int[20];
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            array[i] = i ;
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");

        int numero = array[(int) (Math.random()*20+1)];
        int resultado = OrdenacionBusqueda.busquedaBinaria2(array, numero);
        System.out.println();
        System.out.println("El numero que buscabas es:" + numero);
        System.out.println("El numero encontrado es: " + resultado);
    }
    public static void main(String[] args) {
        pruebaOrdenacion();
        pruebaInsertSort();
        pruebaBusquedaBinaria();
    }
}
