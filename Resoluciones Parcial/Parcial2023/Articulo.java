public class Articulo extends ComponenteMuseo {
    private String descripcion;
    private double precio;
    private int peso;

    public Articulo(String nombre, String descripcion, double precio, int peso) {
        super(nombre);
        this.descripcion = descripcion;
        this.precio = precio;
        this.peso = peso;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPeso() {
        return this.peso;
    }

    public int getCantidad() {
        return 1;
    }

    public Articulo getMayorPrecio() {
        return new Articulo(super.getNombre(), this.descripcion, this.precio, this.peso);
    }

    public ComponenteMuseo getCopia(Condicion c1) {
        if (c1.cumple(this)) {
            return new Articulo(super.getNombre(), this.descripcion, this.precio, this.peso);
        }
        return null;
    }
}

