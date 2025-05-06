import java.time.LocalDate;

class Producto {
    private String nombre;
    private static int contId;
    private int id;
    private int stockActual;
    private int stockMin;
    private double precio;
    private Gravemen gravemen;

    
    public Producto(String nombre){
        this.nombre = nombre;
        this.id = ++contId;
        this.gravemen = null;
    }

    public double getPrecio() {
        if(gravemen != null){
            return gravemen.calcularMontoTotal(LocalDate.now(), this.precio);
        }
        return this.precio;
    }

    public void consumirStock(int cantConsumida) {
        this.stockActual -= cantConsumida;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContId() {
        return contId;
    }

    public static void setContId(int contId) {
        Producto.contId = contId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gravemen getGravemen() {
        return gravemen;
    }

    public void setGravemen(Gravemen gravemen) {
        this.gravemen = gravemen;
    }
    
    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    }

