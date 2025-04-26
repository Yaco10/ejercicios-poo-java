import java.util.PriorityQueue;

public abstract class GestionDeRecursos<Recurso, Espera> {
    
    protected PriorityQueue<Recurso> colaDeRecursos;

    protected PriorityQueue<Espera> colaDeEspera;

    public GestionDeRecursos() {
        colaDeRecursos = new PriorityQueue<>();
        colaDeEspera = new PriorityQueue<>();
    }

    public void agregarRecurso(Recurso recurso) {
        colaDeRecursos.add(recurso);
    }

    public void agregarAEspera(Espera recurso) {
        colaDeEspera.add(recurso);
    }

    public abstract void asignarRecurso();

    public abstract void liberarRecurso();

    public void procesar() {
        while (!colaDeRecursos.isEmpty() || !colaDeEspera.isEmpty()) {
            if (!colaDeEspera.isEmpty()) {
                asignarRecurso();
            }

            liberarRecurso();
        }
    }
}

