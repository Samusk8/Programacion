package instituto;

public class Ciclo {
//    Atributos
    private String nombre;
    private int numeroAlumnos;


//    Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    //constructor con parametros para inicializar todos los atributos

    public Ciclo(String nombre, int numeroAlumnos) {
        nombre = "ciclo1";
        numeroAlumnos = -1;
    }

    @Override
    public String toString() {
        return "Ciclo{" +
                "nombre='" + nombre + '\'' +
                ", numeroAlumnos=" + numeroAlumnos +
                '}';
    }



}
