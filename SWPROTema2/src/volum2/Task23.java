package volum2;

public class Task23 {
    public static void main(String[] args) {
        int n = 6;
        int aux2= 1;
        int aux1=0;
        int aux3;
        int resultado;
        System.out.println(aux1);
        System.out.println(aux2);
        for (int i = 0; i <= n-3; i++) {

            resultado = aux1 + aux2 ;
            System.out.println(resultado);
            aux3 = aux1;
            aux1 = aux2;
            aux2 = resultado;

        }
    }
}
