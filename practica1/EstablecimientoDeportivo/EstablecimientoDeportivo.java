
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;


public class EstablecimientoDeportivo {
    String nombre;
    Cancha[] canchas;
    List<Usuario> usuarios = new ArrayList<>();
    int descuento;

    public EstablecimientoDeportivo(String nombre, Cancha[] canchas, int descuento) {
        this.nombre = nombre;
        this.canchas = canchas;
        this.descuento = descuento;
    }

    public Cancha getCancha(int indexCancha) {
        return canchas[indexCancha];
    }

    public void sacarTurno(int indexCancha, LocalDate fecha, LocalTime hora, String nombreUsuario){
        Usuario usuario = buscarUsuario(nombreUsuario);
        if(usuario == null){
            usuario = new Usuario(nombreUsuario);
            usuarios.add(usuario);
        }
        if(usuario.isSocio(this.nombre)){
            System.out.println("Se aplica un descuento del %" + descuento + " por ser socio");
            System.out.println("El precio final es " + aplicarDescuento(canchas[indexCancha]));
        }
        else{
            System.out.println("El precio final es " + canchas[indexCancha].getPrecio());
        }
        canchas[indexCancha].asignarTurno(fecha, hora, usuario);
    }
    
    public Usuario buscarUsuario(String nombre){
        for(Usuario usuario : usuarios){
            if(usuario.getNombre().equals(nombre)){
                return usuario;
            }
        }
        return null;
    }

    public int aplicarDescuento(Cancha cancha){
        return cancha.getPrecio() - (cancha.getPrecio() * descuento) / 100;
    }

    public void agregarHorario(int indexCancha, int horaInicio, int horaFin, LocalDate fecha){
        canchas[indexCancha].agregarRangoTurnos(horaInicio, horaFin, fecha);
    }


    public void mostrarCanchas(){
        int i=0;
        for(Cancha cancha : canchas){
            System.out.println(i + " " + cancha.getNombreCancha());
            i++;
        }
    }
    public void mostrarHorarios(LocalDate fecha){
        for(Cancha cancha : canchas){
            cancha.getNombreCancha();
            cancha.mostrarHorarios(fecha);
        }
    }

}
