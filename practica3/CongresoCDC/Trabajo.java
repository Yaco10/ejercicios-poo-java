package practica3.CongresoCDC;

import java.util.ArrayList;
import java.util.List;

public class Trabajo {
    private String nombre;
    private String categoria;
    protected List<String> palabrasClave;
    private Evaluador evaluador;

    public Trabajo(String nombre, String categoria) {
        this.evaluador = null;
        this.nombre = nombre;
        this.categoria = categoria;
        this.palabrasClave = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void asignarEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public boolean evaluadorApto(Evaluador evaluador) {
        for (String palabra : palabrasClave) {
            if (!evaluador.tieneConocimiento(palabra)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Si son el mismo objeto, retornamos true
        if (obj == null || getClass() != obj.getClass()) return false;

        Trabajo trabajo = (Trabajo) obj;  // Hacemos el casting
        return nombre.equals(trabajo.nombre) && evaluador.equals(trabajo.evaluador);
    
}
