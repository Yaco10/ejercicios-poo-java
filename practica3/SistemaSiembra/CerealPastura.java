import java.util.List;

public class CerealPastura  {
    private String nombre;
    private static List<String> mineralesRequeridos;
    private static int cantHectareasMinima = 50;

    public CerealPastura(String nombre) {
        this.nombre = nombre;
    }

    public static boolean compatibleConTerreno(Lote lote) {
       if(CerealPastura.mineralesRequeridos.containsAll(lote.getMinerales()) && (lote.getCantHectareas() >= CerealPastura.cantHectareasMinima)){
        return true;
       }
     }
}
