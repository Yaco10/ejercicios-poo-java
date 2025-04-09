import java.time.LocalDate;

public class ProductoCongelado extends ProducoRefrigerado {
    public ProductoCongelado(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numLote, String granjaOrigen,
            int tempRecomendada, int codOrganismoSup) {
        super(fechaVencimiento, fechaEnvasado, numLote, granjaOrigen, tempRecomendada, codOrganismoSup);
    }
}
