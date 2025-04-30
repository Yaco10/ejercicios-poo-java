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

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }
    
    private List<Ficha> filtrarPorCondicion(String tipo) {
        List<Ficha> resultado = new ArrayList<>();
        for (Ficha ficha : this.fichas) {
            if (tipo.equals("PODER") && ficha.getPoderDestruccion() > 2) {
                resultado.add(ficha);
            } else if (tipo.equals("LUGAR") && ficha.getEspacioOcupado() > 4) {
                resultado.add(ficha);
            } else if (tipo.equals("FORTALEZA") && ficha.getFortaleza() > 5) {
                resultado.add(ficha);
            } else if (tipo.equals("PODER_Y_LUGAR") && ficha.getPoderDestruccion() > 2 && ficha.getEspacioOcupado() > 4) {
                resultado.add(ficha);
            } else if (tipo.equals("PODER_O_FORTALEZA") && 
                       (ficha.getPoderDestruccion() > 2 || ficha.getFortaleza() > 5)) {
                resultado.add(ficha);
            } else if (tipo.equals("LUGAR_Y_FORTALEZA") && ficha.getEspacioOcupado() > 4 && ficha.getFortaleza() > 5) {
                resultado.add(ficha);
            } else if (tipo.equals("LUGAR_O_FORTALEZA") && 
                       (ficha.getEspacioOcupado() > 4 || ficha.getFortaleza() > 5)) {
                resultado.add(ficha);
            } else if (tipo.equals("PODER_Y_FORTALEZA") && ficha.getPoderDestruccion() > 2 && ficha.getFortaleza() > 5) {
                resultado.add(ficha);
            } else if (tipo.equals("PODER_O_LUGAR") && 
                       (ficha.getPoderDestruccion() > 2 || ficha.getEspacioOcupado() > 4)) {
                resultado.add(ficha);
            }
        }
        return resultado;
    }
    
    public List<Ficha> fichasPoderMayor2() {
        return filtrarPorCondicion("PODER");
    }
    
    public List<Ficha> fichasLugarMayor4() {
        return filtrarPorCondicion("LUGAR");
    }
    
    public List<Ficha> fichasFortalezaMayor5() {
        return filtrarPorCondicion("FORTALEZA");
    }
    
    public List<Ficha> fichasPoderYLugar() {
        return filtrarPorCondicion("PODER_Y_LUGAR");
    }
    
    public List<Ficha> fichasPoderOFortaleza() {
        return filtrarPorCondicion("PODER_O_FORTALEZA");
    }
    
    public List<Ficha> fichasLugarYFortaleza() {
        return filtrarPorCondicion("LUGAR_Y_FORTALEZA");
    }
    
    public List<Ficha> fichasLugarOFortaleza() {
        return filtrarPorCondicion("LUGAR_O_FORTALEZA");
    }
    
    public List<Ficha> fichasPoderYFortaleza() {
        return filtrarPorCondicion("PODER_Y_FORTALEZA");
    }
    
    public List<Ficha> fichasPoderOLugar() {
        return filtrarPorCondicion("PODER_O_LUGAR");
    }


    
     
}