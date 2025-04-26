package CentroComputos;
class Proceso implements Comparable<Proceso> {
    private static int contadorId = 0; // Para IDs únicos simples
    private int id;
    private int reqMemoria;

    public Proceso(int reqMemoria) {
        this.id = ++contadorId;
        this.reqMemoria = reqMemoria;
    }

    public int getReqMemoria() {
        return reqMemoria;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Proceso{ID=" + id + ", Memoria=" + reqMemoria + "}";
    }

    @Override
    public int compareTo(Proceso otro) {
        return Integer.compare(otro.getReqMemoria(), this.reqMemoria); 
    }
}


