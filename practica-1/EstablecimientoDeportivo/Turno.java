package EstablecimientoDeportivo;
import java.time.LocalDate;

public class Turno {
    Usuario usuario;
    Cancha cancha;
    LocalDate fecha;

    public Turno(Usuario usuario, Cancha cancha, LocalDate fecha) {
        this.usuario = usuario;
        this.cancha = cancha;
        this.fecha = fecha;
    }

}
