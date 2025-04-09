import java.util.ArrayList;
import java.util.List;

public class SistemaAlumnos {
    private List <Carrera> carreras;

    public SistemaAlumnos() {
        this.carreras = new ArrayList<>();
    }

    public String obtenerTarjetaAcceso(Persona persona) {
        String tarjetaAcceso = persona.getNombre() + " " + persona.getApellido() + " - " + persona.getDni();
        return tarjetaAcceso;
    }

    public void carrerasDeAlumno(Alumno alumno) {    
        for (Carrera carrera : carreras) {
            if (carrera.estaAlumnoInscripto(alumno)) {
                System.out.println("El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " esta inscripto en la carrera de " + carrera.getNombre() + ".");
            }
        }
    }
}