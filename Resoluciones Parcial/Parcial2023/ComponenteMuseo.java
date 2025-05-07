abstract class ComponenteMuseo {
    private String nombre;

    public ComponenteMuseo(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    abstract double getPrecio();
    abstract int getCantidad();
    abstract Articulo getMayorPrecio();
    abstract ComponenteMuseo getCopia(Condicion c1);
}

