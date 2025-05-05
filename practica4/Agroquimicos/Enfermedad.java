import java.util.ArrayList;
import java.util.List;

public class Enfermedad {
    private String nombre;
    private List<String> estadosPatologicos;

    public String getNombre() {
        return nombre;
    }

    public Enfermedad(String nombre){
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>();
    }

    public void addEstadoPatologico(String estadoPatologico){
        estadosPatologicos.add(estadoPatologico);
    }

    public boolean tienePatologia(String patologia){
        return estadosPatologicos.contains(patologia);
    }
}
