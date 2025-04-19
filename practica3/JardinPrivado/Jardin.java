import java.util.ArrayList;
import java.util.List;

public class Jardin {
    private List<Planta> plantas;

    public Jardin() {
        plantas = new ArrayList<>();
    }

    public void agregarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void mostrarPlantas() {
        for (Planta p : plantas) {
            System.out.println(p);
        }
    }
}
