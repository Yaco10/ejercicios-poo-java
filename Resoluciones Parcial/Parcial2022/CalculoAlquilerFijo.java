public class CalculoAlquilerFijo implements EstrategiaCalculo {
    private double montoFijo;
    
    @Override 
    public double calcular(ElementoBase e){
        return this.montoFijo;
    }
}
