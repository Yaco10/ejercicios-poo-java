import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<Carta>();
    }

    public void agregarCarta(Carta carta1) {
        cartas.add(carta1);
    }

    public void mezclar() {
        Collections.shuffle(cartas);
    }

   public Carta sacarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(cartas.size() - 1);
        } else {
            return null;
        }
    }
    public int cantCartas(){
      return  cartas.size();
    }
}