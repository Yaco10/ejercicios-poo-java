public class CondicionPesoMayor implements Condicion {
    private int peso;

    public CondicionPesoMayor(int peso) {
        this.peso = peso;
    }

    public boolean cumple(Articulo a) {
        return a.getPeso() > this.peso;
    }
    
}
