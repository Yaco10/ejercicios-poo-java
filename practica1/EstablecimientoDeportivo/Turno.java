

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
    private LocalDate fecha;
    private LocalTime hora;
    private boolean disponible;
    private String nombreEstablecimiento;

    public Turno(LocalDate fecha, LocalTime hora, boolean disponible, String nombreEstablecimiento) {
        this.fecha = fecha;
        this.hora = hora;
        this.disponible = disponible;
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public boolean isDisponible() {
        return disponible;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }


}
