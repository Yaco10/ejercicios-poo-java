import java.util.ArrayList;
import java.util.List;

public class TareaBasica extends ElementoPresupuesto{
    private List<String> materiales;
    private double costo;
    private int tiempoEstimado;
    private int cantEmpAfectados;

    public TareaBasica(, double costo, int tiempoEstimado, int cantEmpAfectados) {
        this.materiales = new ArrayList<>();
        this.costo = costo;
        this.tiempoEstimado = tiempoEstimado;
        this.cantEmpAfectados = cantEmpAfectados;
    }

    
}
