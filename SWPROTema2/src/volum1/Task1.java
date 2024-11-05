//Calcula la longitud d'una circumferència a partir del radi.

package volum1;

public class Task1 {
    public static void main(String[] args) {

        double radio  = 2;
        final double PI =  3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067;
        double longitud = 2*  PI * radio ;
        System.out.println("La longitud de la circunferencia es " + longitud);
    }
}
