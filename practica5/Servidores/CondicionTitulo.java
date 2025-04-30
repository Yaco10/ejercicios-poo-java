public class CondicionTitulo implements Filtrador{
    String tituloCondicion;
    public CondicionTitulo(String tituloCondicion){
        this.tituloCondicion = tituloCondicion;
    }
    @Override
    public boolean cumpleCon(Noticia n){
        return n.getTitulo().equals(tituloCondicion);
    }
}
