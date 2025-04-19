import java.util.ArrayList;
import java.util.List;

public class Cereal {
    private String nombre;
    private List<String> mineralesRequeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean compatibleConTerreno(Lote lote) {
        for (String mineral : mineralesRequeridos) {
            if (!lote.tieneMineral(mineral)) {
                return false;
            }
        }
        return true;
     }
}
