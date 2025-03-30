package EstablecimientoDeportivo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;


public class EstablecimientoDeportivo {
    String nombre;
    Cancha[] canchas;
    List<Usuario> usuarios = new ArrayList<>();

    

    public EstablecimientoDeportivo(String nombre, Cancha[] canchas) {
        this.nombre = nombre;
        this.canchas = canchas;
    }

    public Cancha getCancha(int indexCancha) {
        return canchas[indexCancha];
    }

    public void hacerSocio(String nombre){
        for(Usuario usuario : usuarios){
            if(usuario.getNombre().equals(nombre)){
                usuario.setSocio(true);
                return;
            }
        }
        System.out.println("No se encontro el usuario con el nombre: " + nombre);
    }

    public void mostrarCanchas(){
        int i=0;
        for(Cancha cancha : canchas){
            System.out.println(i + " " + cancha.getNombre());
            i++;
        }
    }
    public void mostrarHorarios(LocalDate fecha){
        for(Cancha cancha : canchas){
            cancha.getNombre();
            cancha.mostrarHorarios(fecha);
        }
    }

    public void mostrarUsuarios(){
        for(Usuario usuario : usuarios){
            System.out.println("Nombre: " + usuario.getNombre() + " Es socio: " + usuario.isSocio());
        }
    }
    
    public Usuario buscarUsuario(String nombre){
        for(Usuario usuario : usuarios){
            if(usuario.getNombre().equals(nombre)){
                return usuario;
            }
        }
        return null;
    }

    public Horario buscarHorario(int indexCancha, LocalDate fecha, LocalTime hora){
        return canchas[indexCancha].getHorarios(fecha, hora);
    }

    public void agregarHorario(int indexCancha, Horario horario){
        canchas[indexCancha].agregarHorario(horario);
    }

    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void solicitarTurno(Usuario usuario, Cancha cancha, Horario horario){
        Turno nuevoTurno = new Turno(usuario, cancha, horario);
            if(cancha.turnoDisponible(nuevoTurno)){
                cancha.solicitarTurno(nuevoTurno);
                usuario.agregarTurno(nuevoTurno);
            }
            else{
                System.out.println("El turno no esta disponible");
            }
            
    
    }
}
