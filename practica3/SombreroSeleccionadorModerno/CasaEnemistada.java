public class CasaEnemistada extends Casa{
    private Casa casaEnemistada;

    public CasaEnemistada(Casa casaEnemistada, int maxAlumnos) {
        super(maxAlumnos);   
        this.casaEnemistada = casaEnemistada;
    }

    @Override
    public boolean alumnoAceptado(Alumno alumno) {
        return super.alumnoAceptado(alumno) && !casaEnemistada.alumnoAceptado(alumno);
    }
}
