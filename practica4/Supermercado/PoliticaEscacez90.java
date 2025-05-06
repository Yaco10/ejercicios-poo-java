public class PoliticaEscacez90 implements PoliticaEscacez{
    private final static double FACTOR = 0.90;

    @Override
    public boolean verificarEscacez(Producto producto) {
        return producto.getStockActual() <= producto.getStockMin() * FACTOR;
    }
}
