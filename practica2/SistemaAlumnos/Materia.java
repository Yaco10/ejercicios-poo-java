public class Materia {
    private String nombre;
    private int cuatrimestre;
    private Profesor profesorACargo;

    public Materia(String nombre, int cuatrimestre, Profesor profesorACargo) {
        this.nombre = nombre;
        if(cuatrimestre != 1 && cuatrimestre != 2){
            throw new IllegalArgumentException("Cuatrimestre inválido: " + cuatrimestre);
        }
        this.cuatrimestre = cuatrimestre;
        this.profesorACargo = profesorACargo;
    }
}
