package CentroComputos;
public class Computadora implements Comparable<Computadora> {
    private static int contadorId = 0;
    private int id;
    private int velocidadProcesamiento;
    private Proceso procesoActual;

    public Computadora(int velocidadProcesamiento) {
        this.id = ++contadorId;
        this.velocidadProcesamiento = velocidadProcesamiento;
        this.procesoActual = null;
    }

    public int getVelocidadProcesamiento() {
        return velocidadProcesamiento;
    }

    public boolean estaLibe(){
        if (procesoActual != null) return false;
        return true;
    }

    public void asignarProceso(Proceso proceso){
        this.procesoActual = proceso;
    }

    public void liberar(){
        this.procesoActual = null;
    }  
    
    
    @Override
    public String toString() {
        if (procesoActual != null) return "Computadora{ID=" + id + ", Velocidad=" + velocidadProcesamiento + ", Proceso actual=" + procesoActual + "}";
        else return "Computadora{ID=" + id + ", Velocidad=" + velocidadProcesamiento + ", Libre}";
    }

    @Override
    public int compareTo(Computadora otra) {
        return Double.compare(otra.getVelocidadProcesamiento(), this.velocidadProcesamiento); // Más rápida primero
    }

}
