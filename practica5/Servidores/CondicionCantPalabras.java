public class CondicionCantPalabras implements Filtrador{
    private int cantPalabras;
    
    public CondicionCantPalabras(int cantPalabras){
        this.cantPalabras = cantPalabras;
    }

    @Override
    public boolean cumpleCon(Noticia n) {
        return n.contarPalabras() <=cantPalabras;
    }
}
