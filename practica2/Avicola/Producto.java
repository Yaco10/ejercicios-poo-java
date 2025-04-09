import java.time.LocalDate;

public class Producto {
    private LocalDate fechaVencimiento;
    private LocalDate fechaEnvasado;
    private int numLote;
    private String granjaOrigen;

    public Producto(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numLote, String granjaOrigen) {
        this.fechaVencimiento = fechaVencimiento;
        this.fechaEnvasado = fechaEnvasado;
        this.numLote = numLote;
        this.granjaOrigen = granjaOrigen;
    }

    public void obtenerEtiqueta() {
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Número de lote: " + numLote);
        System.out.println("Granja de origen: " + granjaOrigen);
    }
}
