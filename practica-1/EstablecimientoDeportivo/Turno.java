package EstablecimientoDeportivo;
public class Turno {
    Usuario usuario;
    Horario horario;
    Cancha cancha;
    

    public Turno(Usuario usuario, Cancha cancha, Horario horario) {
        this.usuario = usuario;
        this.horario = horario;
        this.cancha = cancha;
    }

    public Horario getHorario(){
        return horario;
    }
    
    

}
