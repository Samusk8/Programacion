//Donat un temps expressat en segons, descomposa'l en hores, minuts i segons.

package volum1;

public class Task3 {
    public static void main(String[] args) {
        int tiempo = 3662 ;
        int horas;
        int minutos;
        int segundos;
        horas = tiempo / 3600;
        tiempo = tiempo % 3600;
        minutos = tiempo / 60;
        tiempo = tiempo % 60;
        segundos = tiempo;
        System.out.println(horas + " horas "+ minutos +" minutos "+ segundos +" segundos ");
    }
}
