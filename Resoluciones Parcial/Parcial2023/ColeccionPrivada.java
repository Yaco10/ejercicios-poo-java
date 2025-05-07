public class ColeccionPrivada extends Coleccion{
    public ColeccionPrivada(String nombre, double porcentajeExtraArticulo){
        super(nombre, porcentajeExtraArticulo);
    }

    @Override
    public ComponenteMuseo getCopia(Condicion c1){
        return null;
    }
}
