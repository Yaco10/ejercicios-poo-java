
public class ElementoBase extends ElementoAlquilable {
    private int antiguedad;
    private double precio;
    private String descripcion;
    private EstrategiaCalculo estrategiaAlquiler;

    public ElementoBase(int codigoIdentificacion, int antiguedad, String descripcion, double precio,EstrategiaCalculo estrategiaAlquiler){
        super(codigoIdentificacion); 
        this.antiguedad = antiguedad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estrategiaAlquiler = estrategiaAlquiler;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getPrecio(){
        return this.precio;
    }

    @Override
    public int getAntiguedad() {
        return antiguedad;
    }

    @Override
    public int getCodigoIdentificacion() {
        return super.getCodigoIdentificacion();
    }


    public double getValorAlquiler() {
        return estrategiaAlquiler.calcular(this);
    }

    @Override 
    public ElementoAlquilable getCopia(Condicion c1){
        if(c1.cumple(this)){
            return new ElementoBase(super.getCodigoIdentificacion(), this.antiguedad,this.descripcion, this.precio, this.estrategiaAlquiler);
        }
        else
        return null;
    }
}
