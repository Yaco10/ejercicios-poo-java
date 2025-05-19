import java.util.ArrayList;
import java.util.List;

public class Producto extends ElementoVentas{
    private String nombre;
    private double precio;
    private double peso;
    private int volumen;
    private String marca;
    private List<String> caracteristicas;

    public Producto(String nombre, double precio, double peso, int volumen, String marca) {
        super(nombre);
        this.precio = precio;
        this.peso = peso;
        this.volumen = volumen;
        this.marca = marca;
        this.caracteristicas = new ArrayList<>();
    }

    public void agregarCaracteristica(String caracteristica) {
        this.caracteristicas.add(caracteristica);
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public int getVolumen() {
        return this.volumen;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    public List<String>getCaracteristicas() {
        return new ArrayList<>(this.caracteristicas);
    }
    
}
