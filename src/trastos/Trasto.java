package trastos;

public class Trasto {
//    Atributos
    private String nombre;

    private static int numero = 0;

//    constructor
    public Trasto(String name){
     nombre= name;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int hola) {
        Trasto.numero = hola;
    }

    @Override
    public String toString() {
        return "Trasto{" +
                "nombre='" + nombre + '\'' + "numero= '" + numero + '\'' +
                '}';
    }
}
