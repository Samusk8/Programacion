
// todo A partir d'un sencer que representa les hores treballades per un/a treballador/a i un real que representa el preu en € de cada hora, calcula que ha de cobrar aquesta persona en acabar la setmana. Suposa que totes les hores extra, les que passen de 40, doblen el preu.

package volum1;

public class Task5 {
    public static void main(String[] args) {
        int horas = 15;
        double precio= 30;
        double salario;
        double salarioExtra;


        if (horas>40) {
            salarioExtra = (2*precio)*(horas-40);
            salario = 40*precio + salarioExtra;
        } else {
            salario = horas * precio;
        }

        System.out.println(salario);
    }
}
