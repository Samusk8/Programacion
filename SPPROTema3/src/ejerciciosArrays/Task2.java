package ejerciciosArrays;

public class Task2 {
    public static int sumaValores(int[] array){
        int aux;
        int resultado = 0;
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
            resultado = resultado + array[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        int resultado = sumaValores(array);
        System.out.println(resultado);

    }
}
