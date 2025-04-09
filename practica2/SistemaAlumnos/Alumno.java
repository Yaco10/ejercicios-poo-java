import java.time.LocalDate;

public class Alumno extends Persona {
    private int numLegajo;
    private LocalDate fechaIngreso;

    public Alumno(String nombre, String apellido, int dni, String mail, int numLegajo, LocalDate fechaIngreso) {
        super(nombre, apellido, dni, mail);
        this.numLegajo = numLegajo;
        this.fechaIngreso = fechaIngreso;
    }
}
