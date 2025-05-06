import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Supermercado {
    private List<Producto> listaProductos;
    private List<Factura> listaFacturas;
    private PoliticaEscacez politicasEscacez;

    public Supermercado(PoliticaEscacez politicasEscacez) {
        this.listaProductos = new ArrayList<Producto>();
        this.listaFacturas = new ArrayList<Factura>();
        this.politicasEscacez = politicasEscacez;
    }

    public void agregarProducto(Producto producto) {
        this.listaProductos.add(producto);
    }

    public void registrarCompra(Factura factura) {

        factura.calcularMontoTotal();

        this.listaFacturas.add(factura);

        this.actualizarStockPorCompra(factura);

        System.out.println("-> Factura registrada: " + factura);
    }

    public void actualizarStockPorCompra(Factura factura) {
        for (Producto producto : this.listaProductos) {
            if (factura.contieneProducto(producto)) {
                producto.consumirStock(factura.getItemProducto(producto).getCantidad());
            }
        }
    }

    public double calcularRecaudoEnFecha(LocalDate fecha) {
        double montoTotalDia = 0.0;
        for (Factura factura : this.listaFacturas) {
            if (factura.getFecha().equals(fecha)) {
                montoTotalDia += factura.getMontoTotal();
            }
        }
        return montoTotalDia;
    }

    public double calcularRecaudoEntreFechas(LocalDate desde, LocalDate hasta) {
        double montoTotalRango = 0.0;
        while (!desde.isAfter(hasta)) {
            for (Factura factura : this.listaFacturas) {
                if (factura.getFecha().equals(desde)) {
                    montoTotalRango += factura.getMontoTotal();
                }
            }
            desde = desde.plusDays(1);
        }
        return montoTotalRango;
    }

    public Producto productoMasRecaudo(LocalDate fecha) {
        Producto productoMasRecaudo = null;
        double montoMax = 0.0;
        for (Producto producto : this.listaProductos) {
            double montoActual = 0.0;
            for (Factura factura : this.listaFacturas) {
                if (factura.contieneProducto(producto) && factura.getFecha().equals(fecha)) {
                    montoActual += factura.getItemProducto(producto).calcularValorXCant();

                }
            }
            if (montoActual >= montoMax) {
                montoMax = montoActual;
                productoMasRecaudo = producto;
            }
        }
        return productoMasRecaudo;
    }

    public Producto productoMasRecaudo(LocalDate desde, LocalDate hasta) {
        Producto productoMasRecaudo = null;
        double montoMax = 0.0;
    
        for (Producto producto : this.listaProductos) {
            double montoActual = 0.0;
            LocalDate fechaActual = desde; 
    
            while (!fechaActual.isAfter(hasta)) {
                for (Factura factura : this.listaFacturas) {
                    if (factura.contieneProducto(producto) && factura.getFecha().equals(fechaActual)) {
                        montoActual += factura.getItemProducto(producto).calcularValorXCant();
                    }
                }
                fechaActual = fechaActual.plusDays(1);
            }
    
            if (montoActual >= montoMax) {
                montoMax = montoActual;
                productoMasRecaudo = producto;
            }
        }
    
        return productoMasRecaudo;
    }
    

    public List<Producto> productosEscasez() {
        List<Producto> productosEscasez = new ArrayList<Producto>();
        for (Producto producto : this.listaProductos) {
            if (politicasEscacez.verificarEscacez(producto)) {
                productosEscasez.add(producto);
            }
        }
        return productosEscasez;
    }
}
