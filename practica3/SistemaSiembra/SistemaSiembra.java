package practica3.SistemaSiembra;

import java.util.ArrayList;
import java.util.List;

public class SistemaSiembra {
    private List<Lote> lotes;
    private List<Cereal> cereales;
    private List<String> mineralesPrincipales;

    public SistemaSiembra() {
        this.lotes = new ArrayList<>();
    }

    public void quePuedoSembrar(Lote lote) {
        for (Cereal cereal : this.cereales) {
            if (cereal.compatibleConTerreno(lote)) {
                System.out.println(cereal.getNombre());
            }
        }
    }

    public void dondePuedoSembrar(Cereal cereal) { 
        for (Lote lote : this.lotes) {
            if (cereal.compatibleConTerreno(lote)) {
                System.out.println(lote.getCantHectareas());
            }
        }
    }

    public boolean esLoteEspecial(Lote lote) {
        for (String mineral : mineralesPrincipales) {
            if (!lote.tieneMineral(mineral)) {
                return false;
            }
        }
        return true;
    }
}
