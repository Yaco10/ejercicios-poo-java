public class Persona {
    
    private String nombre;
    private String apellido;
    private int DNI;
    private String mail;

    private static final String EXPRESION_REGULAR_MAIL = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    public Persona(String nombre, String apellido, int DNI, String mail) {
        if (mailValido(mail))
            this.mail = mail;
        else throw new IllegalArgumentException("El mail no es valido");
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    private boolean mailValido(String mail) {
        return mail.matches(EXPRESION_REGULAR_MAIL);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }
}
