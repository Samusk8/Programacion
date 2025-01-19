package ejercicios.recursividad;
/*
* A una classe nova, escriu un mètode que calculi de forma recursiva la suma dels n primers enters, és a dir, la suma dels 5 primers enters és 5+4+3+2+1, la de 4 és 4+3+2+1.*/
public class Task1 {
    public static int suma(int numero){
        if (numero <= 0) {
            return 0;
        }
        return numero + suma(numero-1);
    }

    public static void main(String[] args) {
        int numero = 3;
        int resultado = suma(numero);
        System.out.println(resultado);
    }
}
