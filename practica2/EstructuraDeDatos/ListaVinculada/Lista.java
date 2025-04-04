
public class Lista {
    Nodo cabeza = null;

    public void insertarFinal(Object elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void insertarPrincipio(Object elemento){
        Nodo nuevoNodo = new Nodo(elemento);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    public Object consultarElemento(int pos){
        if(cabeza == null) return null;
        int indice = 0;
        Nodo auxiliar = cabeza;
        while (auxiliar.getSiguiente() != null && indice != pos) {
            auxiliar = auxiliar.getSiguiente();
        }
        if(auxiliar != null){
            return auxiliar;
        }
        return null;

    }

    public int cantidadElementos(){
        if(cabeza == null) return null;
        Nodo auxiliar = cabeza;
        int cantElementos = 1;
        while (auxiliar.getSiguiente()!=null) {
            auxiliar= auxiliar.getSiguiente();
            cantElementos++;
        }
        return cantElementos;
    }


}
