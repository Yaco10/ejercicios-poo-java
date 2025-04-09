import java.time.LocalDate;

public class ProductoCongeladoNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExpuesto;

    public ProductoCongeladoNitrogeno(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numLote,
            String granjaOrigen, int tempRecomendada, int codOrganismoSup, String metodoCongelacion,
            int tiempoExpuesto) {
        super(fechaVencimiento, fechaEnvasado, numLote, granjaOrigen, tempRecomendada, codOrganismoSup);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExpuesto = tiempoExpuesto;
    }

    @Override
    public void obtenerEtiqueta() {
        super.obtenerEtiqueta();
        System.out.println("Método de congelación: " + metodoCongelacion);
        System.out.println("Tiempo expuesto: " + tiempoExpuesto + " minutos");
    }

}