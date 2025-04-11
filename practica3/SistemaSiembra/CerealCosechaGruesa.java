import java.util.ArrayList;
import java.util.List;

public class CerealCosechaGruesa  {
    private String nombre;
    private static List<String> mineralesRequeridos;

    public CerealCosechaGruesa(String nombre) {
        this.nombre = nombre;
    }

    public static boolean compatibleConTerreno(Lote lote) {
        return CerealCosechaGruesa.mineralesRequeridos.containsAll(lote.getMinerales());
     }
}
