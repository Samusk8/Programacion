package ejercicios;

public class Prueba {
    public static void main(String[] args) {
        int numero = 10;
        boolean comprobante = false;
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = i;
            if (numero == valores[i]) {
                comprobante = true;
            }
        }
        if (comprobante){
            System.out.println("Esta eb la array");
        } else {
            System.out.println("no esta en la array");
        }
    }
}
