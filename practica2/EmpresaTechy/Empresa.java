import java.util.ArrayList;
import java.util.List;

public class Empresa {
    List<Persona> personas;

    public Empresa() {
        this.personas = new ArrayList<>();
    }
    
    public String gestionarBoletin(Persona persona, String mensaje) {
        if(persona != null){
            return "Nombre: " + persona.getNombre() + 
            "\nApellido: " + persona.getApellido() + 
            "\nDNI: " + persona.getDNI() + 
            "\nMail: " + persona.getMail() + 
            "\nMensaje: " + mensaje;
        }
        return null;
    }
}
