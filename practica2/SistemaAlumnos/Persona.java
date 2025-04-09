import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private String mail;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
                

    public Persona(String nombre, String apellido, int dni, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

        if (!esEmailValido(mail)) {
            throw new IllegalArgumentException("Email inválido: " + mail);
        }

        this.mail = mail;
    }

    private boolean esEmailValido(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getDni() {    
        return this.dni;
    }

}
