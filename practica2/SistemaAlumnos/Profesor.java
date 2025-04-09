import java.util.List;

public class Profesor extends Persona {
    private String cargo;
    private String dedicacion;
    private List<Materia> materias;

    public Profesor(String nombre, String apellido, int dni, String mail, String cargo, String dedicacion, List<Materia> materias) {
        super(nombre, apellido, dni, mail);
         if (esCargoValido(cargo) == false) {
            throw new IllegalArgumentException("Cargo inválido: " + cargo);
        }
        this.cargo = cargo;
        if(dedicacion.equalsIgnoreCase("simple") || dedicacion.equalsIgnoreCase("semi") || dedicacion.equalsIgnoreCase("exclusiva")) {
            throw new IllegalArgumentException("Dedicacion inválido: " + dedicacion);
        }
        this.dedicacion = dedicacion;
        this.materias = materias;
    }
    
    private boolean esCargoValido(String cargo) {
        if(cargo.equalsIgnoreCase("ayudante") || cargo.equalsIgnoreCase("profesor adjunto") 
         ||cargo.equalsIgnoreCase("profesor titular") || cargo.equalsIgnoreCase("profesor asociado") || cargo.equalsIgnoreCase("jefe de trabajo practico")) {
            return true;
        }
        return false;
    }
}
