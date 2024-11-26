package volum2;

public class Task24 {
    public static void main(String[] args) {

        boolean interruptor = true;
        int primo = 7;
        for (int i = 2; i < primo/2; i++) {
            if (primo % i == 0) {
                interruptor = false;
            }
        }
            if (interruptor ){
                System.out.println(primo+"  es un numero primo");
            } else {
                System.out.println(primo+" no es un numero primo");
            }
    }
}
