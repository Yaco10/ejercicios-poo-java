import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private static int contID;
    private int id;
    private double montoTotal;
    private List<ItemProducto> listaItemProducto;
    private String tipoDescuento;
    private LocalDate fecha;

    // Constantes para los tipos de descuento (usando String)
    public static final String TIPO_DESC_NINGUNO = "NINGUNO";
    public static final String TIPO_DESC_CONTADO = "CONTADO";
    public static final String TIPO_DESC_PREMIO = "PREMIO";

    // Constantes para porcentajes de descuento
    private static final double DESCUENTO_CONTADO_PORC = 0.10; // 10%
    private static final double DESCUENTO_PREMIO_PORC = 0.50;  // 50%

    public Factura (String tipoDescuento, LocalDate fecha) {
        this.id = ++contID;
        this.montoTotal = 0.0;
        this.listaItemProducto = new ArrayList<ItemProducto>();
        this.fecha = fecha;
        if (TIPO_DESC_CONTADO.equals(tipoDescuento) || TIPO_DESC_PREMIO.equals(tipoDescuento)) {
            this.tipoDescuento = tipoDescuento;
        } else {
            this.tipoDescuento = TIPO_DESC_NINGUNO; // Default
        }
    }

    public void calcularMontoTotal(){
        double subtotal = 0.0;
        for(ItemProducto item: listaItemProducto) {
            subtotal += item.calcularValorXCant();
        }

        double descuento = 0.0;
        if(TIPO_DESC_CONTADO.equals(this.tipoDescuento)) {
            descuento = subtotal * DESCUENTO_CONTADO_PORC;
        } else if(TIPO_DESC_PREMIO.equals(this.tipoDescuento)) {
            descuento = subtotal * DESCUENTO_PREMIO_PORC;
        }

        this.montoTotal = subtotal - descuento;
        
        if (this.montoTotal < 0.0) {
            this.montoTotal = 0.0;
        }
    }

    public double getMontoTotal() {
        return montoTotal;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public boolean contieneProducto(Producto producto) {
        for(ItemProducto item: this.listaItemProducto) {
            if(item.getProducto().equals(producto)) {
                return true;
            }
        }
        return false;
    }
        

    public ItemProducto getItemProducto(Producto producto) {
        for(ItemProducto item: this.listaItemProducto) {
            if(item.getProducto().equals(producto)) {
                return item;
            }
        }
        return null;
    }
}
