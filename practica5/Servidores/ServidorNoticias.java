import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

public class ServidorNoticias {
    private List<Noticia> noticias;
    private List<Usuario> usuarios;
    
    public ServidorNoticias() {
        noticias = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void agregarNoticia(Noticia n) {
        noticias.add(n);
    }

    public List<Noticia> filtrar(Filtrador filtro) {
        List<Noticia> noticiasFiltradas = new ArrayList<>();
        for (Noticia n : noticias) {
            if (filtro.cumpleCon(n)) {
                noticiasFiltradas.add(n);
            }
        }
        return noticiasFiltradas;
    }

    public void enviarNoticias() {
        for (Usuario u : usuarios) {
            for (Noticia n : noticias) {
                if(u.leInteresa(n)) {
                    u.recibirNoticia(n);
                }
            }
        }
    }
}
