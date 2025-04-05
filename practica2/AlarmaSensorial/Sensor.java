public class Sensor {
    String lugar;
    boolean estado;
    public Sensor(String lugar) {
        this.lugar = lugar;
        this.estado = false;
    }

    public String getLugar() {
        return lugar;
    }
    public boolean getEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}