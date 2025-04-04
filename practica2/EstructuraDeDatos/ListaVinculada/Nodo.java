
public class Nodo {
    Object elemento;
    Nodo siguiente;

    public Nodo(Object elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Object getElemento() {
        return this.elemento;
    }
    
    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
