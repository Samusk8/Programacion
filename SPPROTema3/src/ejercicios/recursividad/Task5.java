package ejercicios.recursividad;
/*Escriu un mètode que calculi el terme n-essim de la sèrie de Fibonacci de forma recursiva. Des del main crida aquest mètode per a mostrar els 10 primers termes de la successió.*/
public class Task5 {
    public static int fibonacci(int numero){
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return fibonacci(numero -1) + fibonacci( numero - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + "   ");
        }
    }
}
