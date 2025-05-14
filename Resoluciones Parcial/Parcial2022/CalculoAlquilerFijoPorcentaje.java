public class CalculoAlquilerFijoPorcentaje implements EstrategiaCalculo {
    private double porcentaje;
    private double fijo;

    public CalculoAlquilerFijoPorcentaje(double porcentaje, double fijo){
        this.porcentaje = porcentaje;
        this.fijo = fijo;
    }

    @Override
    public double calcular(ElementoBase e){
        return fijo + e.getPrecio()*porcentaje;
    }
}
