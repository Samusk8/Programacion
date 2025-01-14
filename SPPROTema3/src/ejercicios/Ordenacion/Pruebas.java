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
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = NumeroAleatorio.aleatorio();
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        OrdenacionBusqueda.insertSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
    public static void main(String[] args) {
        pruebaOrdenacion();
        pruebaInsertSort();
    }
}
