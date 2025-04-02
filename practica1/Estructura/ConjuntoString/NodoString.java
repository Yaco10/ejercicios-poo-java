package Estructura.ConjuntoString;
public class NodoString {
    String contenido;
    NodoString siguiente;

    public NodoString(String contenido) {
        this.contenido = contenido;
        this.siguiente = null;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public NodoString getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoString siguiente) {
        this.siguiente = siguiente;
    }
}