package EstablecimientoDeportivo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {
    LocalDate fecha;
    LocalTime hora;
    boolean disponible;

    public Horario(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.disponible = true;
    }


    public void mostrarHora(){
        System.out.println("Hora: " + hora.toString());
    }

    public void mostrarDisponibilidad(){
        System.out.println("Disponible: " + disponible);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora(){
        return hora;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    

}
