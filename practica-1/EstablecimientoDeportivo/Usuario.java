package EstablecimientoDeportivo;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    String nombre;
    boolean socio;
    List<Turno> turnos;
    


    public Usuario(String nombre) {
        this.nombre = nombre;
        this.socio = false;
        this.turnos = new ArrayList<>();
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean isSocio() {
        return this.socio;
    }


    public void agregarTurno(Turno turno) {
        this.turnos.add(turno);
    }


}
