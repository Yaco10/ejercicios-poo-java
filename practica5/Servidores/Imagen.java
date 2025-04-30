public class Imagen extends Contenido{
    private String url;
    private String decripcion;
    public Imagen(String decripcion, String url) {
        this.decripcion = decripcion;
        this.url = url;
    }
    
    @Override
    public String getTexto() {
        return decripcion;
    }
}

