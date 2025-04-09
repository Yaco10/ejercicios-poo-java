import java.util.ArrayList;
import java.util.List;

public class Alumno {
    public String nombre;
    public Casa casa;
    public List<String> cualidades;
    public List<Alumno> familiares;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Casa getCasa() {
        return casa;
    }

    public boolean esFamiliar(Alumno alumno) {
        return familiares.contains(alumno);
    }

    public boolean tieneCualidad(String cualidad) {
        return cualidades.contains(cualidad);
    }
}