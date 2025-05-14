import java.util.List;

public class TareaEspecial extends TareaBasica{
    private List<String> especialidades;
    public TareaEspecial(List<String> materiales, double costo, int tiempoEstimado, int cantEmpAfectados) {
        super(materiales, costo, tiempoEstimado, cantEmpAfectados);
    }
    
}
