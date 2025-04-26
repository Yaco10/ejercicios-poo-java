package CentroComputos;
import java.util.*;

class CentroDeComputos {
    private PriorityQueue<Proceso> colaProcesos;
    private PriorityQueue<Computadora> colaComputadoras; 
    private List<Computadora> computadorasEnProceso;

    public CentroDeComputos() {
        this.colaProcesos = new PriorityQueue<>();
        this.colaComputadoras = new PriorityQueue<>();
        this.computadorasEnProceso = new ArrayList<>();
    }

    public void agregarProceso(Proceso p) {
        colaProcesos.add(p);
    }

    public void agregarComputadora(Computadora c) {
        colaComputadoras.add(c);
    }

    public void asignarProceso(){
        if (!colaProcesos.isEmpty() && !colaComputadoras.isEmpty()) {
            Proceso procesoPrioritario = colaProcesos.poll();
            Computadora computadoraPrioritaria = colaComputadoras.poll();
            computadoraPrioritaria.asignarProceso(procesoPrioritario);
            computadorasEnProceso.add(computadoraPrioritaria);
        }
    }

    public void ejecutar() {
        while (!colaProcesos.isEmpty() && !colaComputadoras.isEmpty()) {
            asignarProceso();
        }
    }

    public void finalizarProcesos() {
        for(Computadora computadora : computadorasEnProceso) {
            computadora.liberar();
            colaComputadoras.add(computadora);
        }
        computadorasEnProceso.clear();
    }
    

}
