import java.time.LocalDate;

public class GravemenAlto implements Gravemen{
    private static final double PORC_PROV = 0.15;
    private static final double PORC_NAC = 0.10;
    private static final double MONTO = 0.50;
    private static final double MONTO_DOM = 0.5;

@Override
public double calcularMontoTotal(LocalDate fecha, double monto) {
    double impuestoProv = monto * PORC_PROV;
    double impuestoNac = monto * PORC_NAC + MONTO;
    if (fecha.getDayOfWeek().getValue() == 7) {
        impuestoProv += MONTO_DOM;
    }
    return monto + impuestoProv + impuestoNac;
}

}