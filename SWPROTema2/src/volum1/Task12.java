// todo A l'exercici 5 afegeix el codi necessari per calcular l'IRPF. Suposa que si el salari no arriba a 300€ l'IRPF=10%, si esta entre 300 i 500 és el 20% i si és major o igual és el 30%. Mostra al final el salari brut, l'import de l'IRPF i el salari net.

package volum1;

public class Task12 {
    public static void main(String[] args) {
        int horas = 40;
        double precio= 8.2;
        double salario;
        double salarioExtra;
        double irpf;
        double salarioNeto;


        if (horas>40) {
            salarioExtra = (2*precio)*(horas-40);
            salario = 40*precio + salarioExtra;
        } else {
            salario = horas * precio;
        }

        System.out.println("El salario bruto es "+ salario);

        if (salario<300) {
            irpf = salario * 0.1;
            salarioNeto = salario - irpf;
        } else if (salario < 500){
            irpf = salario * 0.2;
            salarioNeto = salario - irpf;
        } else {
            irpf = salario * 0.3;
            salarioNeto = salario - irpf;
        }
        System.out.println("Le retienen " +irpf+ "euros de IRPF");
        System.out.println("El salario neto es "+ salarioNeto);
    }
}
