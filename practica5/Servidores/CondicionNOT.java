public class CondicionNOT implements Filtrador {
    private Filtrador c1;

    public CondicionNOT(Filtrador c1) {   
        this.c1 = c1;
    }

    @Override
    public boolean cumpleCon(Noticia n) {
        return !c1.cumpleCon(n); 
    }
}

