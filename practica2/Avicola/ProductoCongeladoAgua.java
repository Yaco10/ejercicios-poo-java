import java.time.LocalDate;

public class ProductoCongeladoAgua extends ProductoCongelado{
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public ProductoCongeladoAgua(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numLote, String granjaOrigen, int tempRecomendada, int codOrganismoSup, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fechaVencimiento, fechaEnvasado, numLote, granjaOrigen, tempRecomendada, codOrganismoSup);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public void obtenerEtiqueta() {
        super.obtenerEtiqueta();
        System.out.println("Porcentaje de nitrógeno: " + porcentajeNitrogeno + "%");
        System.out.println("Porcentaje de oxígeno: " + porcentajeOxigeno + "%");
        System.out.println("Porcentaje de dióxido de carbono: " + porcentajeDioxidoCarbono + "%");
        System.out.println("Porcentaje de vapor de agua: " + porcentajeVaporAgua + "%");
    }
}
