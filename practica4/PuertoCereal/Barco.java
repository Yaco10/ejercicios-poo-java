

public class Barco implements  Comparable<Barco> {
    private static int contId;
    private int id;
    private int capacidad;
    private boolean cargado;
    
    public Barco(int capacidad) {
        this.id = ++contId;
        this.capacidad = capacidad;
        this.cargado = false;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void cargarBarco() {
        this.cargado = true;
    }

    @Override
    public int compareTo(Barco nuevo) {
        return Integer.compare(nuevo.getCapacidad(), this.getCapacidad());
    }
}