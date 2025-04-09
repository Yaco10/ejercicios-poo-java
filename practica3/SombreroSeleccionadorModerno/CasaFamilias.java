public class CasaFamilias extends Casa {
    public CasaFamilias(int maxAlumnos) {
        super(maxAlumnos);
    }
    @Override
    public bool alumnoAceptado(Alumno alumno) {
       return super.alumnoAceptado(alumno) && tieneFamiliar(alumno);
    }

    public boolean tieneFamiliar(Alumno alumno) {
        for (Alumno familiar : super.alumnos) {
            if (alumno.esFamiliar(familiar)) {
                return true;
            }
        }
        return false;
    }
}
