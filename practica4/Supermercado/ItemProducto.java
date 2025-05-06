import java.util.Objects;

public class ItemProducto {
    private Producto producto;
    private int cantidad;
    private double montoXCant;

    public ItemProducto(Producto producto, int cantidad){
        this.producto = producto;
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva.");
        }
        this.cantidad = cantidad;
        this.montoXCant = calcularValorXCant();
    }

    public double calcularValorXCant(){
        return this.producto.getPrecio() * this.cantidad;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemProducto other = (ItemProducto) obj;
        return Objects.equals(producto.getNombre(), other.producto.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(producto.getNombre());
    }
}
