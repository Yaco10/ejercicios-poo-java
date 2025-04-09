import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private int duracion;
    private List<Materia> materias;
    private List<Profesor> profesores;
    private List<Alumno> alumnos;

    public Carrera(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.materias = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public boolean estaAlumnoInscripto(Alumno alumno) {
        return alumnos.contains(alumno);
    }

    public String getNombre() {
        return nombre;
    }
}
