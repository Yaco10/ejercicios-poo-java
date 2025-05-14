public class CondicionPrecioMayor implements Condicion {
    private int precio;
    
    public CondicionPrecioMayor(int precio) {
        this.precio = precio;
    }
    
    public boolean cumple(Articulo a) {
        return a.getPrecio() > this.precio;
    }
    
}
