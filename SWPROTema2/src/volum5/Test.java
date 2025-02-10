package volum5;

public class Test {
    public static void main(String[] args) {
        int a = 3;
        a = test(a);
        System.out.println("a = " + a);
    }
    public static int test(int b) {
        b++;
        System.out.println("b = " + b);
        return b;
    }
}
