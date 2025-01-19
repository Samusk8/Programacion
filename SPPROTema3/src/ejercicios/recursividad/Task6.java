package ejercicios.recursividad;
/*Copia l'exercici anterior i modifica'l de forma que el mètode que calcula el terme n-èssim mostri per pantalla el terme que està calculant, n. Executa el programa. Creus que és eficient? Per què?*/
public class Task6 {
    public static int fibonacci(int numero){
        System.out.println("Se esta calculando el "+ numero + " numero");
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
        /*No es eficiente, ya que cada vez que se repite el metodo muestra
        * por pantalla el numero que esta calculando*/
    }
}
