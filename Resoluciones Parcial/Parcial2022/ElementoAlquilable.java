public abstract class ElementoAlquilable  {
    private int codigoIdentificacion;
    public ElementoAlquilable(int codigoIdentificacion){
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public int getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    abstract ElementoAlquilable getCopia(Condicion c1);
    abstract double getPrecio();
    abstract double getValorAlquiler();
    abstract int getAntiguedad();
}