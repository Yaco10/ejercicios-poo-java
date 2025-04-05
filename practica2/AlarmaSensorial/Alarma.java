import java.util.ArrayList;
import java.util.List;

public class Alarma {
    private Timbre timbre;
    private List<Sensor> sensores;

    public Alarma() {
        this.timbre = new Timbre();
        this.sensores = new ArrayList<>();
        Sensor ventana = new Sensor("ventana");
        Sensor vidrio = new Sensor("vidrio");
        Sensor puerta = new Sensor("puerta");
        sensores.add(ventana);
        sensores.add(vidrio);
        sensores.add(puerta);
    }   

    public void agregarSensor(String lugar)  {
        Sensor sensor = new Sensor(lugar);
        sensores.add(sensor);
    }
    public Timbre getTimbre() {
        return timbre;
    }

    public boolean comprobar() {    
        for (Sensor sensor : sensores) {
            if (sensor.getEstado()) {
                return true;
            }
        }
        return false;
    }

    public void lugaresPeligro(){
        for (Sensor sensor : sensores) {
            if (sensor.getEstado()) {
                System.out.println(sensor.getLugar());
            }
        }
    }

    public void activarAlarma() {
        if (comprobar()) {
            timbre.hacerSonar();
            lugaresPeligro();
        }
    }
}
