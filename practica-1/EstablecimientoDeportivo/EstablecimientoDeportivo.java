package EstablecimientoDeportivo;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class EstablecimientoDeportivo {
    String nombre;
    Cancha[] canchas;
    List<Turno> turnos;

    public EstablecimientoDeportivo(String nombre, Cancha[] canchas) {
        this.nombre = nombre;
        this.canchas = canchas;
        this.usuarios = new ArrayList<>();
        this.turnos = new ArrayList<>(); 
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

    public void solicitarTurno(Usuario usuario, Cancha cancha, LocalDate fecha){
        Turno nuevoTurno = new Turno(usuario, cancha, fecha);
        if(usuario.getDinero() >= cancha.getPrecio()){
            usuario.cobrarDinero(cancha.getPrecio());
            turnos.add(nuevoTurno);
            usuario.agregarTurno(nuevoTurno);

        }
        else{
            System.out.println("El monto es insuficiente");
        }
    }
}
