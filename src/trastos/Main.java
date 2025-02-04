package trastos;

public class Main {
    public static void main(String[] args) {
        System.out.println(Trasto.getNumero());
        Trasto portatil = new Trasto("portatil");
        Trasto telefono = new Trasto("telefono");
        Trasto teclado = new Trasto("teclado");
        Trasto.setNumero(1234);
        System.out.println("teclado = " + teclado);
        System.out.println("teclado = " + portatil);
        System.out.println("telefono = " + telefono);


    }
}
