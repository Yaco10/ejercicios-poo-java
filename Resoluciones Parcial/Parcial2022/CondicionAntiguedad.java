public class CondicionAntiguedad implements Condicion {
    private int antiguedadBase;
    public CondicionAntiguedad(int antiguedadBase){
        this.antiguedadBase = antiguedadBase;
    }

    @Override
    public boolean cumple(ElementoBase e){
        return e.getAntiguedad() > antiguedadBase;
    }
}
