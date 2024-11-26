//todo Escriu una classe que crei un array de 10 sencers, els inicialitzi de 1 a 10 i els mostri per pantalla.

package volum4;

public class Task32 {
    public static void main(String[] args) {
        int[] numeros; // declarar array
        numeros = new int[11];// cuantos valores tiene
        for (int i = 1; i <= numeros.length; i++) {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}
