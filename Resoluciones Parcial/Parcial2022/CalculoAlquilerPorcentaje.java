public class CalculoAlquilerPorcentaje implements EstrategiaCalculo {
    private double porcentaje;
    public CalculoAlquilerPorcentaje(double porcentaje){
        this.porcentaje = porcentaje;
    }
    @Override
    public double calcular(ElementoBase elemento){
        return elemento.getPrecio() * this.porcentaje;
    }
    
}
