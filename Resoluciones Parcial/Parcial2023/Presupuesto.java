import java.util.ArrayList;
import java.util.List;

public class Presupuesto extends ElementoPresupuesto{ {
    private List<ElementoPresupuesto> tareas;
    private double porcDesc;

    public Presupuesto(String nombre, double porcDec) {
        super(nombre);
        this.tareas = new ArrayList<>();
        this.porcDesc = porcDec;
    }

    @Override
    public double getCosto(){
        double costo = 0;
        for(ElementoPresupuesto t : tareas){
            costo += t.getCosto();
        }
        return costo - costo * porcDesc;
    }
}
