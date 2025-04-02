package Estructura.FilaEnteros;

public class NodoFila {
    int numero;
    NodoFila siguiente;

    public NodoFila(int numero) {
        this.numero = numero;
        this.siguiente = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoFila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoFila siguiente) {
        this.siguiente = siguiente;
    }

    
}