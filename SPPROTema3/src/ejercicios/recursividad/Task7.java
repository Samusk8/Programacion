package ejercicios.recursividad;

public class Task7 {
    public static int mcd(int m, int n) {
        int r = m % n;
        if (r == 0) {
            return n;
        } else {
            return mcd(m, r);
        }
    }

    public static void main(String[] args) {
        int numero1 = 20 ;
        int numero2 = 45;
        int resultado = mcd(numero1, numero2);
        System.out.println(resultado);
    }
}
