import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private int puntajeMinimo;
    private List<Ficha> fichas;
    private int dificultad;
    
    public Tablero (int puntajeMinimo){
        this.puntajeMinimo = puntajeMinimo;
        this.fichas = new ArrayList<>();
        this.dificultad = calcularDificultad();
    }

    private int calcularDificultad(){
        int sumaFortaleza = 0;
        int sumaPoder = 0;
        for(Ficha ficha : this.fichas){
            sumaFortaleza += ficha.getFortaleza();
            sumaPoder += ficha.getPoderDestruccion();
        }
        return sumaFortaleza / sumaPoder;
    }
    
    public List<Ficha> fichasPoderMayor2(){
        List<Ficha> fichasCompatible = new ArrayList<>();
        for(Ficha ficha : this.fichas){
            if(ficha.getPoderDestruccion() > 2){
                fichas.add(ficha);
            }
        }
        return fichasCompatible;
    }

    public List<Ficha> fichasLugarMayor4(){
        List<Ficha> fichasCompatible = new ArrayList<>();
        for(Ficha ficha : this.fichas){
            if(ficha.getEspacioOcupado() > 4){
                fichas.add(ficha);
            }
        }
        return fichasCompatible;
    }

    public List<Ficha> fichasLugarMayor4(){
        List<Ficha> fichasCompatible = new ArrayList<>();
        for(Ficha ficha : this.fichas){
            if(ficha.getEspacioOcupado() > 4){
                fichas.add(ficha);
            }
        }
        return fichasCompatible;
    }


    
     
}