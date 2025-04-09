import java.time.LocalDate;

public class Empleado extends Persona {
    private String relacionLaboral;
    private LocalDate fechaIngreso;
    private int departamentoAsignado;
    
    public Empleado(String nombre, String apellido, int DNI, String mail, String relacionLaboral, LocalDate fechaIngreso, int departamentoAsignado) {
        super(nombre, apellido, DNI, mail);
        this.relacionLaboral = relacionLaboral;
        this.fechaIngreso = fechaIngreso;
        this.departamentoAsignado = departamentoAsignado;
    }
}
