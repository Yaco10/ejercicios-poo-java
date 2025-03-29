package EstablecimientoDeportivo;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    String nombre;
    boolean socio;
    List<Turno> turnos;
    int dinero;


    public Usuario(String nombre, boolean socio) {
        this.nombre = nombre;
        this.socio = socio;
        this.turnos = new ArrayList<>();
        this.dinero = 0;
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

    public int getDinero(){
        return this.dinero;
    }

    public void cobrarDinero(int monto){
        this.dinero -= monto;
    }

    public void agregarTurno(Turno turno) {
        this.turnos.add(turno);
    }

    public void cargarDinero(int dinero) {
        this.dinero += dinero;
    }
}
