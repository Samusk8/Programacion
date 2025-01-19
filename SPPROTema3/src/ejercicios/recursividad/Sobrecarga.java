package ejercicios.recursividad;
/*Crea una classe i comprova que
 l'exemple de sobrecàrrega dels apunts, el que té
 unes quantes versions de saluda, funciona
@author samuel
 .*/

public class Sobrecarga {
    public static void saluda() {
        System.out.println("Hola!");
    }
    public static void saluda(String nom) {
        System.out.println("Hola " + nom + " !");
    }
    public static void saluda(String nom1, String apellido) {
        System.out.println("Hola " + nom1 + " " + apellido + " !");
    }
    public static void saluda(String nom, int dies) {
        System.out.println("Hola " + nom + " ! Feia " + dies + " que no et veia!");
    }

    public static void main(String[] args) {
        String nom = "Samuel";
        String apellido = "Jiménez";
        int dias = 324425;
        saluda();
        saluda(nom);
        saluda(nom, apellido);
        saluda(nom, dias);
    }
}
