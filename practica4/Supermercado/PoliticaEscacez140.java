public class PoliticaEscacez140 implements PoliticaEscacez {
    private final static double FACTOR = 1.40;
    @Override
    public boolean verificarEscacez(Producto producto) {
        return producto.getStockActual() <= producto.getStockMin() * FACTOR;
    }
}
