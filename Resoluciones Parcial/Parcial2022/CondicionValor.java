public class CondicionValor implements Condicion {
    private int precioBase;
    public CondicionValor(int precioBase){
        this.precioBase = precioBase;
    }

    @Override
    public boolean cumple(ElementoBase e){
        return e.getPrecio() > this.precioBase;
    }
}
