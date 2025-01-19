package ejercicios.recursividad;
/*El factorial d'un natural es pot definir de forma recursiva com n!=n*(n-1)! Amb el cas especial 1!=1. Crea un mètode que donat un paràmetre n torni (return) el factorial de n. Realitza el càlcul de forma recursiva.*/
public class Task2 {
    public static int factorial(int numero){
        if (numero <= 1) {
            return 1;
        }
        return numero * factorial(numero -1);
    }

    public static void main(String[] args) {
        int numero = 3;
        int resultado = factorial(numero);
        System.out.println(resultado);
    }
}
