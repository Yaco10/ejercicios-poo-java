public class PoliticaEscacezMinima implements PoliticaEscacez {
    @Override
    public boolean verificarEscacez(Producto producto) {
        return producto.getStockActual() <= producto.getStockMin();

    }
}