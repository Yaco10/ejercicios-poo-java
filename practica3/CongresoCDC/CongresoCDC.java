package practica2.CongresoCDC;

import java.util.ArrayList;
import java.util.List;

public class CongresoCDC {
    private List<Trabajo> trabajos;
    private List<Evaluador> evaluadores;

    public CongresoCDC() {
        this.trabajos = new ArrayList<Trabajo>();
        this.evaluadores = new ArrayList<Evaluador>();
    }

    public void asignarEvaluador(Evaluador evaluador, Trabajo trabajo) {
        if (trabajo.evaluadorApto(evaluador)) {
            trabajo.asignarEvaluador(evaluador);
        }
    }

    public void queTrabajosPuedoAsignar(Evaluador evaluador) {
        for (Trabajo trabajo : trabajos) {
            if (trabajo.evaluadorApto(evaluador)) {
                System.out.println(trabajo.getNombre());
            }
        }
    }

    public void queEvaluadorAsignar(Trabajo trabajo) {
        for (Evaluador evaluador : evaluadores) {
            if (trabajo.evaluadorApto(evaluador)) {
                System.out.println(evaluador.getNombre());
            }
        }
    }

    public int cantTrabajosEvaluador(Evaluador evaluador) {
        int cant = 0;
        for (Trabajo trabajo : trabajos) {
            if(evaluador.getNombre().equals(trabajo.getEvaluador().getNombre())) {
    }
}
