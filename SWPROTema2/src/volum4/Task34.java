//todo Escriu una classe que generi dos arrays de sencers de la mateixa longitud i els inicialitzi.

package volum4;

public class Task34 {
    public static void main(String[] args) {
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        System.out.println("v1 == v2 no funciona porque aunque las dos arrays tengan la misma longitud," +
                " al no tener valores miran el espacio de memoria RAM en el que se almacenan, " +
                "el cual no es el mismo, a no ser que v1=v2");

//        generar valores aleatorios en array v1
        boolean comparar = true;
        v1 = new int[10];
        int Min = 0;
        int Max = 15 - v1.length;
        int aleatorio = Min + (int)(Math.random() * ((Max - Min) + 1));
        for (int i = 0; i < v1.length ; i++) {
            v1[i] = aleatorio;
            aleatorio++;
            System.out.println(v1[i]);
        }


//        generar vaalores aleatorios en v2
        v2 = new int[10];
        Max = 15 - v2.length;
         aleatorio = Min + (int)(Math.random() * ((Max - Min) + 1));
        for (int i = 0; i < v2.length ; i++) {
            v2[i] = aleatorio;
            aleatorio++;
            System.out.println(v2[i]);
        }

//        comparar valores de las dos array
        for (int i = 0; i < v2.length; i++) {
            if (v1[i] != v2[i]) {
                comparar = false;
                break;
            }
        }
        if (comparar){
            System.out.println("las array son iguales");
        } else {
            System.out.println( "las array no son iguales");
        }
    }
}
