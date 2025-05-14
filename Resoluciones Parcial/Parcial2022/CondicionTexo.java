public class CondicionTexo implements Condicion {
    private String texto;
    public CondicionTexo(String texto){
        this.texto = texto;
    }

    @Override
    public boolean cumple(ElementoBase e){
        return e.getDescripcion().contains(texto);
    }
    
}
