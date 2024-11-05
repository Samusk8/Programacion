package volum1;

public class Task19 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }
    }
}
//* La diferencia es que con continue saltamos el valor que esta
//* en la condicion especificada y continuamos, En cambio, en el break
//* cuando se cumpla esa condicion, el codigo se rompe y sale y pasa a lo siguiente
// d
