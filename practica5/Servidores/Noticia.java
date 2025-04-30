import java.util.ArrayList;
import java.util.List;

public class Noticia {
    private String titulo;
    private String clasificacion;
    private List<Contenido> cuerpo;
    
    public Noticia(String titulo, String clasificacion) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.cuerpo = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public boolean contienePalabra(String palabra){
        for(Contenido c : cuerpo){
            if(c.contienePalabra(palabra)){
                return true;
            }
        }
        return false;
    }

    public int contarPalabras(){
        int cantidadPalabras = 0;
        for(Contenido c : cuerpo){
            cantidadPalabras += c.contarPalabras();
        }
        return cantidadPalabras;
    }
}
