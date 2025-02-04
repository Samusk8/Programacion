package instituto;

public class Asignatura {
//    Atributos
    String nombre;
    int horasSemanales;

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
    public Asignatura(String nombre, int horasSemanales) {

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
