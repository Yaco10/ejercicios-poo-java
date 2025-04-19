
public class Poster extends Trabajo{
    public Poster(String nombre, String categoria) {
        super(nombre, categoria);
    }

    @Override
    public boolean evaluadorApto(Evaluador evaluador) {
        for (String palabra : this.palabrasClave) {
            if (evaluador.tieneConocimiento(palabra)) {
                return true;
            }
        }
        return false;
    }
}
