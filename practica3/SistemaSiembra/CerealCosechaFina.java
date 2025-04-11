import java.util.ArrayList;
import java.util.List;

public class CerealCosechaFina {
    private String nombre;
    private static List<String> mineralesRequeridos;

    public CerealCosechaFina(String nombre) {
        this.nombre = nombre;
    }

    public static boolean compatibleConTerreno(Lote lote) {
        return CerealCosechaFina.mineralesRequeridos.containsAll(lote.getMinerales());
     }
}
