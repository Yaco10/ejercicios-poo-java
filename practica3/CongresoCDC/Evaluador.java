package practica3.CongresoCDC;

import java.util.List;

public class Evaluador {
    private String nombre;
    private List<String> areasAptas;

    public Evaluador(String nombre) {
        this.nombre = nombre;
        this.areasAptas = new ArrayList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public boolean tieneConocimiento(String tema){
        return areasAptas.contains(tema);
    }
}
