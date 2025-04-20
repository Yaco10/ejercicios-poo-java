package practica3.SombreroSeleccionadorModerno;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<String> cualidades;
    private int maxAlumnos;
    private List<Alumno> alumnos;
    
    public Casa( int maxAlumnos) {
        this.cualidades = new ArrayList<>();
        this.maxAlumnos = maxAlumnos;
        this.alumnos = new ArrayList<>();
}

    public bool alumnoAceptado(Alumno alumno) {
        for (String cualidad : this.cualidades) {
            if (!alumno.tieneCualidad(cualidad)) {
                return false;
            }
        }
        return true;
    }
}