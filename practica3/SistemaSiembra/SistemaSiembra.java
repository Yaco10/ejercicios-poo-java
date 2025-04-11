package practica3.SistemaSiembra;

import java.util.ArrayList;
import java.util.List;

public class SistemaSiembra {
    private List<Lote> lotes;
    private List<String> mineralesPrincipales;

    public SistemaSiembra() {
        this.lotes = new ArrayList<>();
    }

    public void quePuedoSembrar(Lote lote) {
        if(CerealCosechaFina.compatibleConTerreno(lote)){
            System.out.println("Cosecha fina");
        }
        if(CerealCosechaGruesa.compatibleConTerreno(lote)){
            System.out.println("Cosecha gruesa");
        }
        if(CerealPastura.compatibleConTerreno(lote)){
            System.out.println("Pastura");
        }
    }

    public boolean esLoteEspecial(Lote lote) {
        return lote.esEspecial(this.mineralesPrincipales);
    }
}
