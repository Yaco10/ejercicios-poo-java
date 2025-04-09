package practica3.SombreroSeleccionadorModerno;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<String> cualidades;
    private int maxAlumnos;
    protected List<Alumno> alumnos;
    
    public Casa( int maxAlumnos) {
        this.cualidades = new ArrayList<>();
        this.maxAlumnos = maxAlumnos;
        this.alumnos = new ArrayList<>();
}

    agregarAlumno(Alumno alumno) {
            alumnos.add(alumno);  
    }

    public boolean espacioDisponible(){
        if(alumnos.size() < maxAlumnos){
            return true;
        }
        return false;
    }

    public bool alumnoAceptado(Alumno alumno) {
        if (Alumno.getCasa != null) {
            return false;
        }
        for (String cualidad : this.cualidades) {
            if (!alumno.tieneCualidad(cualidad)) {
                return false;
            }
        }
        return true;
    }
}