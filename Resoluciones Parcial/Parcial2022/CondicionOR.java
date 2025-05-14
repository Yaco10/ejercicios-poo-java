public class CondicionOR implements Condicion {
    private Condicion condicion1;
    private Condicion condicion2;

    public CondicionOR(Condicion condicion1, Condicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(ElementoBase e) {
        return condicion1.cumple(e) || condicion2.cumple(e);
    }
}

