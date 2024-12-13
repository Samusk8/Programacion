package ejercicios;

public class Task5 {
    public static double media(double a, double b, double c){
        double media = (a+b+c)/3;
        return media;
    }

    public static void main(String[] args) {
        double a =  2;
        double b =  8;
        double c =  3;
        double media = media(a, b, c);
        System.out.println("La media es "+ media);
    }
}
