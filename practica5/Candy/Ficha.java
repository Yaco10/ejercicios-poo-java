public abstract class Ficha {
    private int fortaleza;
    private int espacioOcupado;

    public Ficha (int fortaleza, int espacioOcupado){
        this.espacioOcupado = espacioOcupado;
        this.fortaleza = fortaleza;
    }

    abstract int getPoderDestruccion();
    
    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    public int getFortaleza() {
        return fortaleza;
    }
}