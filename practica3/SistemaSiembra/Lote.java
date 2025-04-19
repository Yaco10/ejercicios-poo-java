package practica3.SistemaSiembra;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int cantHectareas;
    private List<String> minerales;

    public Lote(int cantHectareas, List<String> minerales) {
        this.cantHectareas = cantHectareas;
        this.minerales = minerales;
    }

    public int getCantHectareas() {
        return cantHectareas;
    }

    public List<String> getMinerales() {
        return new ArrayList<>(minerales);
    }

    public boolean tieneMineral(String mineral) {   
        return minerales.contains(mineral);
    }
}
