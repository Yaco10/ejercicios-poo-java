package EstablecimientoDeportivo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cancha {
    String nombre;
    final int precio;  // Hacemos el precio final para que no se pueda modificar fuera de la clase.
    List<Turno> turnos = new ArrayList<>();
    List<Horario> horarios =  new ArrayList<>();
    
    public Cancha(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;  // Precio se define una sola vez en el constructor
    }
    
    public int getPrecio(){
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Horario getHorarios(LocalDate fecha, LocalTime hora){
        for (Horario horario : horarios) {
            if(horario.getFecha().equals(fecha) && horario.getHora().equals(hora)){
                return horario;
            }
        }
        return null;
    }

    public void agregarHorario(Horario horario){
        this.horarios.add(horario);
    }

    public boolean turnoDisponible(Turno turno){
        boolean disponible = true;
        for(Horario horario : horarios){
            if(horario.getFecha().equals(turno.getHorario().getFecha()) && horario.getHora().equals(turno.getHorario().getHora()) && !horario.isDisponible()){
                disponible = false;
            }
        }
        return disponible;
    }

    public void solicitarTurno(Turno turno){
        if(turnoDisponible(turno)){
            turno.getHorario().setDisponible(false);
            turnos.add(turno);
            System.out.println("Su turno fue reservado con éxito");
        }
        else{
            System.out.println("El horario elegido no está disponible");
        }
    }

    public void agregarHorario(LocalDate fecha, LocalTime hora){
        Horario horario = new Horario(fecha, hora);
        this.horarios.add(horario);
    }

    public void mostrarHorarios(LocalDate fecha){
        System.out.println("Horarios para la fecha " + fecha + ": ");
        for(Horario horario : horarios){
            if(fecha.equals(horario.getFecha()))
                System.out.println("-----------------");
                horario.mostrarHora(); 
                horario.mostrarDisponibilidad();
                System.out.println("-----------------");
        }
    }
}


