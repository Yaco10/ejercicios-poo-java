public class Video extends Contenido{
    private int duracion;
    private String descripcion;
    private String url;
    
    public Video(int duracion, String descripcion, String url) {
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.url = url;
    }

    @Override
    public String getTexto() {
        return descripcion;
    }
}
