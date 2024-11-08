// todo Recupera un nombre passat com a argument des de la línia de comandes o teclat i mostra la taula de multiplicar d'aquest nombre.

package volum2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
    int numero;
    int resultado;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero");
        numero = teclado.nextInt();
        for (int i = 1; i <= 10 ; i++) {
           resultado = i * numero;
            System.out.println(numero+"*"+i+"="+resultado);
        }
    }
}
