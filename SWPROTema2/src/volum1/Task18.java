// todo Repeteix l'exercici 14 de forma que mostri només els nombres parells.

package volum1;

public class Task18 {
    public static void main(String[] args) {
        int fi = 30;
        for (int inicio = 0; inicio <= fi; inicio++) {
            if (inicio % 2 == 0){
                System.out.println(inicio);
            }
        }
    }
}
