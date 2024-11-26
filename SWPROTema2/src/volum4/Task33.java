//todo Escriu una classe que crei un array de 10 sencers, els inicialitzi aleatòriament de 100 a 200 i els mostri per pantalla.

package volum4;

public class Task33 {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[10];
        int Min = 100;
        int Max = 200 - numeros.length;
        int aleatorio = Min + (int)(Math.random() * ((Max - Min) + 1));
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = aleatorio;
            aleatorio++;
            System.out.println(numeros[i]);
        }
    }
}
