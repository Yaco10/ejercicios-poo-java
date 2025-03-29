package Estructura.ColaEnteros;

public class NodoCola {
    int numero;
    NodoCola siguiente;

    public NodoCola(int numero) {
        this.numero = numero;
        this.siguiente = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    
}
