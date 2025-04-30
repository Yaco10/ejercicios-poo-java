public class CondicionAND implements Filtrador {
    private Filtrador c1, c2;

    public CondicionAND(Filtrador c1, Filtrador c2) {   
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumpleCon(Noticia n) {
        return c1.cumpleCon(n) && c2.cumpleCon(n);
    }
}

