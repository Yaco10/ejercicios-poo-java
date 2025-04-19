import java.time.LocalDate;

public class Planta {
    private static int contador = 1; // Para generar IDs automáticos

    private int id;
    private String nombreCientifico;
    private String nombreComun;
    private String paisOrigen;
    private LocalDate fechaCompra;

    public Planta(String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra) {
        this.id = contador++;
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.paisOrigen = paisOrigen;
        this.fechaCompra = fechaCompra;
    }

    public int getId() {
        return id;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    @Override
    public String toString() {
        return "Planta #" + id + ": " + nombreComun + " (" + nombreCientifico + "), Origen: " + paisOrigen + ", Comprada: " + fechaCompra;
    }
}
