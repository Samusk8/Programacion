package ejercicios.Utilidades;

public class OrdenacionBusqueda {
    public static int[] burbuja(int[] ordenar){
        for (int i = 2; i <= ordenar.length ; i++) {
            for (int j = 0; j <= ordenar.length - i; j++) {
                if (ordenar[j] > ordenar[j+1]) {
                    int aux = ordenar[j];
                    ordenar[j] = ordenar[j+1];
                    ordenar[j+1] = aux;
                }
            }
        }
        return ordenar;
    }
    public static int[] insertSort(int[] ordenar ){
        for (int i = 1; i < ordenar.length ; i++) {
            int index = ordenar[i];
            int j = i - 1;
            while (j >= 0 && ordenar[j] > index) {
                ordenar[j+1] = ordenar[j];
                j = j -1;
            }
            ordenar[j +1] = index;
        }
        return ordenar;
    }
    public static int[] quickSort(int[] ordenar, int izquierda, int derecha){
        int i = izquierda;
        int j = derecha;
        int pivot = ordenar[(i + j) / 2];
        do {
            while (ordenar[i] < pivot) {
                i++;
            }
            while (ordenar[j] < pivot) {
                j++;
            }
            if (i <= j) {
                int aux = ordenar[i];
                ordenar[i] = ordenar[j];
                ordenar[j] = aux;
                i++;
                j++;
            }
        }while (i < j);
        if (izquierda <j) {
            quickSort(ordenar, izquierda, j);
        }
        if ( i < derecha) {
            quickSort(ordenar, i, derecha);
        }
        return ordenar;
    }
    public static int busquedaBinaria(int[] a, int buscar){
        int primero = 0;
        int ultimo = a.length - 1;
        int mitad = -1;
        while (primero <= ultimo){
            mitad = (primero + ultimo) / 2;
            if (buscar == a[mitad]) {
                return mitad;
            } else if (a[mitad] > buscar) {
                ultimo = mitad -1;
            } else {
                primero = mitad +1;
            }
        }
        return -1;
    }
    public static int busquedaBinaria2(int[] a, int buscar){
        int primero = 0;
        int ultimo = a.length - 1;
        int mitad = -1;
        int contador = 0;
        while (primero <= ultimo){
            contador++;
            mitad = (primero + ultimo) / 2;
            if (buscar == a[mitad]) {
                System.out.println();
                System.out.println("Comparaciones realizadas: " + contador);
                return mitad;
            } else if (a[mitad] > buscar) {
                ultimo = mitad -1;
            } else {
                primero = mitad +1;
            }
        }
        System.out.println();
        System.out.println("Comparaciones realizadas: " + contador);
        return -1;
    }

}
