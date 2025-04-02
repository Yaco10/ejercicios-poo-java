

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    String nombre;
    List<Turno> historialTurnos;
    

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.historialTurnos = new ArrayList<>();
    }


    public String getNombre() {
        return this.nombre;
    }

    public void agregarTurno(Turno turno) {
        this.historialTurnos.add(turno);
    }

    public boolean isSocio(String nombreEstablecimiento) {
        LocalDate now = LocalDate.now();
        LocalDate limite = now.minusMonths(4);
        int cantTurnos = 0;
        for (Turno turno : this.historialTurnos) {
            if (turno.getNombreEstablecimiento().equals(nombreEstablecimiento)) {
                if(turno.getFecha().isAfter(limite)){
                    cantTurnos++;
                }
            }
        }
        return cantTurnos >= 4;
    }


}
