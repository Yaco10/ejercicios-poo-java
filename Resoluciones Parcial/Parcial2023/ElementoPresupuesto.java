abstract class ElementoPresupuesto {
    private String nombre;
    public abstract double getCosto();
    public abstract String getMateriales();
    public abstract getCantEmpAfectados();
    public abstract getTiempoEstimado();
    public abstract getCopia(Condicion c1);
    public abstract getLista(Condicion c1);

    public ElementoPresupuesto(String nombre) {
        this.nombre = nombre;
    }
}