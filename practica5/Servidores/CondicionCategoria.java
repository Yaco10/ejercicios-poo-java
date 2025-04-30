public class CondicionCategoria implements Filtrador {
    String categoriaFitlrador;
    public CondicionCategoria(String categoriaFitlrador){
        this.categoriaFitlrador = categoriaFitlrador;
    }

    @Override 
    public boolean cumpleCon(Noticia n){
        return n.getClasificacion().equals(categoriaFitlrador);
    }
}
