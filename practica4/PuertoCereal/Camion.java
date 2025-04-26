import java.time.LocalDate;

public class Camion implements  Comparable<Camion> {
    private static int contId;
    private int id;
    private LocalDate fechaCarga;
    private boolean conCarga;

    public Camion(LocalDate fechaCarga) {
        this.id = ++contId;
        this.fechaCarga = fechaCarga;
        this.conCarga = true;
    }

    public boolean isConCarga() {
        return conCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void desCargar() {
        this.conCarga = false;
    }

    @Override
    public int compareTo(Camion otro) {
    return this.getFechaCarga().compareTo(otro.getFechaCarga());
}

}
