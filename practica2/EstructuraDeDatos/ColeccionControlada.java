import java.util.Arrays;

public class Coleccion {
    private Object[] elementos;
    private int tamaño;
    private cantLecturas;
    private cantEscrituras;

    public Coleccion() {
        elementos = new Object[10];
        tamaño = 0;
        cantLecturas = 0;
    }

    public void add(Object obj) {
        if (tamaño == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }
        elementos[tamaño] = obj;
        tamaño++;
        cantEscrituras++;
    }

    public int size() {
        return tamaño;
    }

    public Object get(int posicion) {
        if (posicion < 0 || posicion >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        cantLecturas++;
        return elementos[posicion];
    }

    public int cantEscrituras(){
        return cantEscrituras
    }

    public int cantLecturas(){
        return cantLecturas
    }
}