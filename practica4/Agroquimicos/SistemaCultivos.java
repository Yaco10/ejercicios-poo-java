import java.util.ArrayList;
import java.util.List;

public class SistemaCultivos {
    private List<Cultivo> cultivos;
    private List<Agroquimico> agroquimicos;

    public SistemaCultivos(){
        this.agroquimicos = new ArrayList<>();
        this.cultivos = new ArrayList<>();
    }

    public void addCultivos (Cultivo cultivo){
        cultivos.add(cultivo);
    }

    public void addAgroquimico(Agroquimico agroquimico){
        agroquimicos.add(agroquimico);
    }

    public List<Agroquimico> agroquimicoParaEnfermedad(Enfermedad enfermedad){
        List<Agroquimico> agroquimicosAptos = new ArrayList<>();
        for(Agroquimico agroquimico : this.agroquimicos){
            if(agroquimico.cubreEnfermedad(enfermedad)){
                agroquimicosAptos.add(agroquimico);
            }
        }
        return agroquimicosAptos;
    }

    public List<Agroquimico> agroquimicosAptosEC(Enfermedad enfermedad, Cultivo cultivo){
        List<Agroquimico> agroquimicosAptos = new ArrayList<>();
        for(Agroquimico agroquimico : this.agroquimicos){
            if(!agroquimico.seDesaconseja(cultivo)){
                if(agroquimico.cubreEnfermedad(enfermedad)){
                    agroquimicosAptos.add(agroquimico);
                }
            }
        }
        return agroquimicosAptos;
    }
}
