
public class Alarma {
    private Timbre timbre;
    private boolean ventana;
    private boolean puerta;
    private boolean vidrio;

    public Alarma() {
        this.timbre = new Timbre();
        this.ventana = false;
        this.puerta = false;
        this.vidrio = false;
    }   

    public Timbre getTimbre() {
        return timbre;
    }

    public boolean comprobar() {    
        return ventana || puerta || vidrio;
    }

    public void activarAlarma() {
        if (comprobar()) {
            timbre.hacerSonar();
        }
    }
}
