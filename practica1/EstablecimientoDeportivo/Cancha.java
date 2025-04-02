

import java.util.*;
import java.time.*;

public class Cancha {
    String nombreEstablecimiento;
    String nombreCancha;
    int precio;
    List<Turno> turnos = new ArrayList<>();

    public Cancha(String nombreEstablecimiento, String nombreCancha, int precio) {
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.nombreCancha = nombreCancha;
        this.precio = precio;
    }

    public String getNombreCancha() {
        return nombreCancha;
    }
    
    public int getPrecio() {
        return precio;
    }

    public void asignarTurno(LocalDate fecha, LocalTime hora, Usuario usuario) {
        Turno turno = buscarTurno(fecha, hora);
        if(turno != null){
            turno.setDisponible(false);
            usuario.agregarTurno(turno);
        }
        else{
            System.out.println("El turno no esta disponible");
        }
    }

    public Turno buscarTurno(LocalDate fecha, LocalTime hora) {
        for (Turno turno : turnos) {
            if (turno.getFecha().equals(fecha) && turno.getHora().equals(hora) && turno.isDisponible()) {
                return turno;
            }
        }
        return null;
    }

    public void agregarRangoTurnos(int horaInicio, int horaFin, LocalDate fecha) {
        if(horaFin < horaInicio){
            return;
        }
        for (int i = horaInicio; i < horaFin; i++) {
            Turno turno = new Turno(fecha, LocalTime.of(i, 0), true, nombreEstablecimiento);
            turnos.add(turno);
        }
    }

    public void mostrarHorarios(LocalDate fecha) {
        for (Turno turno : turnos) {
            if (turno.getFecha().equals(fecha)) {
                System.out.println("Hora" + turno.getHora());
            }
        }
    }

    
}
