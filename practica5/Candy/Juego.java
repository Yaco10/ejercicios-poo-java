import java.util.ArrayList;
import java.util.List;

public class Juego {
    private List<Tablero> tableros;
    private int puntaje;
    private int tableroActual;

    public Juego (int puntajeVictoria){
        this.puntajeVictoria = puntajeVictoria;
        this.tableroActual = 0;
        this.tableros = new ArrayList<>();
    }

    public boolean verificarVictoriaNivel(){
        if(puntaje >= tableros[0].getPuntajeMinimo()){
            tableroActual++;
            return true;
        }
        return false;
    }
}
