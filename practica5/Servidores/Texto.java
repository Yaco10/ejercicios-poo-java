public class Texto extends Contenido{
    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    @Override
    public String getTexto(){
        return texto;
    }
}
