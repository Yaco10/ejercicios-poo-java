import java.util.ArrayList;
import java.util.List;

public class Cultivo {
    private String nombre;
    private List<Enfermedad> enfermedadesFrecuentes;
    
    public Cultivo(String nombre){
        this.nombre = nombre;
        this.enfermedadesFrecuentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addEnfermedadFrecuente(Enfermedad enfermedad){
        enfermedadesFrecuentes.add(enfermedad);
    }

    public boolean agroquimicoUtil(Agroquimico agroquimico){
        if(agroquimico.seDesaconseja(this)) return false;

        for(Enfermedad enfermedad : this.enfermedadesFrecuentes){
            if(agroquimico.cubreEnfermedad(enfermedad)){
                return true;
            }
        }
        return false;
    }
}
