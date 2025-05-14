public class ElementoObsolencia extends ElementoAlquilable {
    private int idRef;
    private ElementoAlquilable elementoEnvuelto;
    private int umbralEnvejecimiento;
    private double factorPrecioEnvejecido;
    private double factorReduccionAlquilerObsoleto;
    
    public ElementoObsolencia(int codigoIdentificacion, int antiguedad, String descripcion, double precio,
        EstrategiaCalculo estrategiaAlquiler, int idRef, ElementoAlquilable elementoEnvuelto,
        int umbralEnvejecimiento, double factorPrecioEnvejecido, double factorReduccionAlquilerObsoleto) {
        super(codigoIdentificacion, antiguedad, descripcion, precio, estrategiaAlquiler);
        this.idRef = idRef;
        this.elementoEnvuelto = elementoEnvuelto;
        this.umbralEnvejecimiento = umbralEnvejecimiento;
        this.factorPrecioEnvejecido = factorPrecioEnvejecido;
        this.factorReduccionAlquilerObsoleto = factorReduccionAlquilerObsoleto;
    }

     @Override
    public double getPrecio() {
        int antiguedadContenido = elementoEnvuelto.getAntiguedad();
        double valorOriginalContenido = elementoEnvuelto.getPrecio();
        if (antiguedadContenido < umbralEnvejecimiento) {
            return valorOriginalContenido;
        } else {
            int mesesDiferencia = antiguedadContenido - umbralEnvejecimiento;
            double descuento = valorOriginalContenido * factorPrecioEnvejecido * mesesDiferencia;
            return Math.max(0, valorOriginalContenido - descuento); 
        }
    }

    @Override
    public double getValorAlquiler() {
        double costoAlquilerContenido = elementoEnvuelto.getValorAlquiler();
        if (elementoEnvuelto.getAntiguedad() >= umbralEnvejecimiento) {
            return costoAlquilerContenido * factorReduccionAlquilerObsoleto;
        } else {
            return costoAlquilerContenido;
        }
    }


}
