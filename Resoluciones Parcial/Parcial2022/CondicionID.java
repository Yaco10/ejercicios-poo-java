public class CondicionID implements Condicion {
    private int idBuscada;
    public CondicionID(int idBuscada){
        this.idBuscada = idBuscada;
    }

    @Override
    public boolean cumple(ElementoBase e){
        return e.getCodigoIdentificacion() == idBuscada;
    }
    
}
