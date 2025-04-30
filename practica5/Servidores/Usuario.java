import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<String> preferencias;
    private List<Noticia> noticiasRecibidas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.preferencias = new ArrayList<>();
        this.noticiasRecibidas = new ArrayList<>();
    }

    public boolean contienePreferencia(String categoria) {
        for(String p : preferencias){
            if(p.equals(categoria)){
                return true;
            }
        }
        return false;
    }

    public boolean leInteresa(Noticia n){
        for(String p : preferencias){
            if(n.contienePalabra(p)){
                return true;
            }
        }
        return contienePreferencia(n.getClasificacion()) || contienePreferencia(n.getTitulo()); 
    }

    public void agregarPreferencia(String categoria) {
        preferencias.add(categoria);
    }

    public void recibirNoticia(Noticia n) {
        noticiasRecibidas.add(n);
    }
}
