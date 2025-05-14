import java.util.ArrayList;
import java.util.List;

public class Coleccion extends ComponenteMuseo {
    private List<ComponenteMuseo> colecciones;
    private double porcentajeExtraArticulo;
    private static double tope = 0.75;

    public Coleccion(String nombre, double porcentajeExtraArticulo) {
        super(nombre);
        this.colecciones = new ArrayList<ComponenteMuseo>();
        this.porcentajeExtraArticulo = porcentajeExtraArticulo;
    }


    public ComponenteMuseo getCopia(Condicion c1){
        Coleccion copia = new Coleccion(getNombre(), porcentajeExtraArticulo);
        boolean agrego = false;
        for(ComponenteMuseo c: colecciones){
            ComponenteMuseo aux = c.getCopia(c1);
            if(aux != null){
                copia.addElemento(aux);
                agrego=true;
            }
        }
        if(agrego){
            return copia;
        }
        else
            return null;
    }

    public Articulo getMayorPrecio() {
        Articulo articuloMayor = null;
        for(ComponenteMuseo c: colecciones){
            Articulo actual = c.getMayorPrecio();
            if(articuloMayor == null || actual.getPrecio() > articuloMayor.getPrecio()){
                articuloMayor = actual;
            }
        }
        return articuloMayor;
    }

    public double getPrecio(){
        int total = 0;
        for(ComponenteMuseo c : this.colecciones){
            total += c.getPrecio() * porcentajeExtraArticulo;
        }
        double porcentajeTotal = this.getCantidad() * porcentajeExtraArticulo;
        
        if(porcentajeExtraArticulo > tope){
            porcentajeTotal = tope;
        }

        return total + total * porcentajeTotal;
    }

    public int getCantidad(){
        int cantidad = 0;
        for(ComponenteMuseo c : this.colecciones){
            cantidad += c.getCantidad();
        }
        return cantidad;
    }

    public void addElemento(ComponenteMuseo c){
        this.colecciones.add(c);
    }

}
