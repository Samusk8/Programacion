package instituto;

public class Asignatura2 {
//    Atributos
    String nombre;
    int horasSemanales;
    Asignatura Ciclo;
    Ciclo DAM;

//    Getters y Setters
//    Click der -> generate -> getter & setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

//    Contstructor que recibe por parametro los atributos
    public Asignatura2(String nombre, int horasSemanales) {

    }

//    Metodo toString

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", horasSemanales=" + horasSemanales +
                '}';
    }
}
