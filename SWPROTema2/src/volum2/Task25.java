package volum2;

public class Task25 {
    public static void main(String[] args) {
        int primo = 11;
        int divisor = 2;
        boolean interruptor = true;
        while (divisor < primo / 2 && interruptor) {
            if (primo % divisor == 0) {
                interruptor = false;
            }
            divisor = divisor + 1;
        }
        if (interruptor) {
            System.out.println(primo + "  es un numero primo");
        } else {
            System.out.println(primo + " no es un numero primo");
        }
    }
}

