package instituto;

public class CicloArray {
    //    Atributos
    private String nombre;
    private int numeroAlumnos;
    private Asignatura[] arrayAsignaturas;
    private int maxAsignaturas;
    private int numeroAsignaturas;


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

    public CicloArray(String nombre, int numeroAlumnos, int maxAsignaturas) {
        nombre = "ciclo1";
        numeroAlumnos = 0;
        Asignatura[] arrayAsignaturas = new Asignatura[this.maxAsignaturas];

    }
    public boolean añadirAsignatura(Asignatura nuevaAsignatura) {
        if (numeroAsignaturas == arrayAsignaturas.length){
            return false;
        } else {
            arrayAsignaturas[numeroAsignaturas] = nuevaAsignatura;
            numeroAsignaturas++;
            return true;
        }
    }
    public String returnAsignatura(String nombreAsignatura){
        boolean interruptor;
        for (int i = 0; i < arrayAsignaturas.length; i++) {
            if ( arrayAsignaturas[i].getNombre().equals(nombreAsignatura)) {
                return nombreAsignatura;
            }
        }
            return null;

    }

    @Override
    public String toString() {
        return "Ciclo{" +
                "nombre='" + nombre + '\'' +
                ", numeroAlumnos=" + numeroAlumnos +
                '}';
    }



}
