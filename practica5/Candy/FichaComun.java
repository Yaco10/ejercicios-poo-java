public class FichaComun extends Ficha {
    private int poderDestruccion;

    public FichaComun (int poderDestruccion, int fortaleza, int espacioOcupado){
        super(fortaleza, espacioOcupado);
        this.poderDestruccion = poderDestruccion;
    }

    @Override
    public int getPoderDestruccion(){
        return poderDestruccion;
    }
}
