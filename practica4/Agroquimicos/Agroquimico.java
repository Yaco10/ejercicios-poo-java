import java.util.ArrayList;
import java.util.List;

public class Agroquimico {
    private String nombre;
    private List<Cultivo> cultivosDesaconsejados;
    private List<String> estadosPatologicosAplicar;

    public Agroquimico(String nombre) {
        this.nombre = nombre;
        this.cultivosDesaconsejados = new ArrayList<>();
        this.estadosPatologicosAplicar = new ArrayList<>();
    }

    public String getNombre(){
        return this.nombre;
    }


    public void addCultivoDesaconsejado(Cultivo cultivo) {
        cultivosDesaconsejados.add(cultivo);
    }

    public void addEstadosPatologicosAplicar(String estadoPatologico) {
        estadosPatologicosAplicar.add(estadoPatologico);
    }
    
    public boolean cubreEnfermedad(Enfermedad enfermedad){
        for(String patologia : this.estadosPatologicosAplicar){
            if(!enfermedad.tienePatologia(patologia)){
                return false;
            }
        }
        return true;
    }

    public boolean seDesaconseja(Cultivo cultivo){
        return cultivosDesaconsejados.contains(cultivo);
    }

}