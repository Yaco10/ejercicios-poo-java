public class PoliticaEscacez120 implements PoliticaEscacez{
    private final static double FACTOR = 1.20;

    @Override
    public boolean verificarEscacez(Producto producto) {
        return producto.getStockActual() <= producto.getStockMin() * FACTOR;
    }
}
