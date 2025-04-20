package practica3.SombreroSeleccionadorModerno;

public class CasaEnemistada extends Casa{
    private Casa casaEnemistada;

    public CasaEnemistada(Casa casaEnemistada, int maxAlumnos) {
        super(maxAlumnos);   
        this.casaEnemistada = casaEnemistada;
    }
}
