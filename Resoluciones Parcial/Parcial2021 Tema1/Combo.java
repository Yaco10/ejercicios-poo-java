import java.util.ArrayList;
import java.util.List;

public class Combo extends ElementoVentas{
    private List<ElementoVentas> productos;
    private String nombre;
    public Combo(String nombre, List<ElementoVentas> productos) {
        super(nombre);
        this.productos = productos;
    }

    public void agregarProducto(ElementoVentas producto){
        this.productos.add(producto);
    }

    @Override 
    public double getPrecio(){
        double precioTotal = 0;
        for(ElementoVentas producto : this.productos){
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }

    @Override
    public double getPeso(){
        double pesoTotal = 0;
        for(ElementoVentas producto : this.productos){
            pesoTotal += producto.getPeso();
        }
        return pesoTotal;
    }

    @Override 
    public int getVolumen(){
        int volumenMayor = 0;
        for(ElementoVentas producto : this.productos){
            int volumenAux = producto.getVolumen();
            if(volumenAux > volumenMayor){
                volumenMayor = volumenAux;
            }
        }
        return volumenMayor;
    }

    @Override
    public String getMarca(){
        for(ElementoVentas e : productos){
            return e.getMarca();
        }
        return "";
    }

    @Override 
    public List<String> getCaracteristicas(){
        List<String> caracteristicas = new ArrayList()<>();
        for(ElementoVentas e : productos){
            caracteristicas.addAll(e.getCaracteristicas());
        }
        return caracteristicas;
    }
}
