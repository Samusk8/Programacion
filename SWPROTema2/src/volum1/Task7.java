package volum1;

public class Task7 {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        int c = 6;
        if (a>b & a>c){
            System.out.println("El mayor es a");
        } else if (b>a & b>c){
            System.out.println("el mayor es b");
        }else if (c>a & c>b) {
            System.out.println("El mayor es c");
        }else if(a == b){
            System.out.println("a y b son iguales");
        } else if (b==c) {
            System.out.println("b y c son iguales");
        } else if (c==a) {
            System.out.println("c y a son iguales");
        }
    }
}
