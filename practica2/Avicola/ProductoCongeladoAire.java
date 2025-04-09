import java.time.LocalDate;

public class ProductoCongeladoAire extends ProductoCongelado {
    private int gramosSal;

    public ProductoCongeladoAire(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numLote, String granjaOrigen,
            int tempRecomendada, int codOrganismoSup, int gramosSal) {
        super(fechaVencimiento, fechaEnvasado, numLote, granjaOrigen, tempRecomendada, codOrganismoSup);
        this.gramosSal = gramosSal;
    }

    @Override
    public void obtenerEtiqueta() {
        super.obtenerEtiqueta();
        System.out.println("Gramos de sal: " + gramosSal + "g");
    }
}
