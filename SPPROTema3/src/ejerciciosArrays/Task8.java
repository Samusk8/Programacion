package ejerciciosArrays;

import ejercicios.Utilidades.LeerTeclado;
import ejercicios.Utilidades.UtilidadesCosola;

import java.util.Arrays;

public class Task8 {
    public static  void notas(double[] array){
        System.out.println("Sus notas son:");
        System.out.println(Arrays.toString(array));
        media(array);
    }
    public static void media(double[] array){
        double media = 0;
        for (int i = 0; i < array.length ; i++) {
            media = (array[i] + media);
        }
        media = media / array.length;
        System.out.println("La media le queda en:");
        System.out.println(media);
    }

    public static void main(String[] args) {
        System.out.println("Cuantas notas va a introducir? ");
        int cantidad = LeerTeclado.leerTecladoInt();
        double[] array = new double[cantidad];
        for (int i = 0; i < array.length; i++) {
            double nota = LeerTeclado.leerTecladoDouble();
            array[i] = nota;
        }
        notas(array);

    }
}
