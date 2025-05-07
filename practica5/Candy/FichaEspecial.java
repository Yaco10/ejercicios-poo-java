public class FichaEspecial extends Ficha {
    private int poderDestruccion;

    public FichaEspecial ( int fortaleza, int espacioOcupado){
        super(fortaleza, espacioOcupado);
    }

    @Override
    public int getPoderDestruccion(){
        return super.getFortaleza() / super.getEspacioOcupado();
    }
}
