//Intercanvia els valors de dues variables del mateix tipus. Mostra-les per pantalla abans i després de fer el canvi.

package volum1;

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int aux = a;
        System.out.println("a es "+a+" b es "+b);
        a =  b;
        b = aux;

        System.out.println("a es "+a+" b es "+b);
    }
}
