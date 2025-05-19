import java.util.List;

public abstract class ElementoVentas{
    private String nombre;
    abstract public double getPrecio();
    abstract public double getPeso();
    abstract public int getVolumen();
    abstract public String getMarca();
    abstract public List<String> getCaracteristicas();

    public ElementoVentas(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}