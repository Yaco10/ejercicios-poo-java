import java.time.LocalDate;

public class ProducoRefrigerado extends Producto {
    private int codOrganismoSup;
    private int tempRecomendada;

    public ProducoRefrigerado(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numLote, String granjaOrigen,
            int tempRecomendada, int codOrganismoSup) {
        super(fechaVencimiento, fechaEnvasado, numLote, granjaOrigen);
        this.codOrganismoSup = codOrganismoSup;
        this.tempRecomendada = tempRecomendada;
    }

    @Override
    public void obtenerEtiqueta() {
        super.obtenerEtiqueta();
        System.out.println("Temp. Recomendada: " + tempRecomendada);
        System.out.println("Código Organismo Supervisado: " + codOrganismoSup);
    }

}