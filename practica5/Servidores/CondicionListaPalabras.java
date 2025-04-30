public class CondicionListaPalabras implements Filtrador {
    private String[] palabras;
    public CondicionListaPalabras(String[] palabras) {
        this.palabras = palabras;
    }
    public boolean cumpleCon(Noticia n) {
        for(String p : palabras) {
            if(!n.contienePalabra(p)) {
                return false;
            }
        }
        return true;
    }
    
}
