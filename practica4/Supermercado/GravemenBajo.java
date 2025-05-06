import java.time.LocalDate;

public class GravemenBajo implements Gravemen{
    private static final double PORC_PROV = 0.10;
    private static final double PORC_NAC = 0.5;
    private static final double MONTO = 0.10;
    private static final double MONTO_PAR = 0.25;

@Override
public double calcularMontoTotal(LocalDate fecha, double monto) {
    double impuestoProv = monto * PORC_PROV + MONTO;
    double impuestoNac = monto * PORC_NAC;
    if (fecha.getYear() % 2 == 0){
        impuestoNac += MONTO_PAR;
    }
    return monto + impuestoProv + impuestoNac;
}
}
