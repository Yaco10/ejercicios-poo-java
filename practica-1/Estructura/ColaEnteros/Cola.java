package Estructura.ColaEnteros;

public class Cola {
    NodoCola primero;

    public Cola() {
        this.primero = null;
    }

    public void insertar(int numero) {
        NodoCola nuevo = new NodoCola(numero);
        if (primero == null) {
            primero = nuevo;
            return;

        } else {
            NodoCola aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public int solicitarElemento() {
        if(primero == null){
            return -1;
    }
        int aux = primero.getNumero();
        primero = primero.getSiguiente();
        return aux;
    }

    public int cantElementos(){
        if(primero == null){
            return 0;
        }
        else {
            int cantElementos = 0;    
            NodoCola aux = primero;
            while (aux != null) {
                cantElementos++;
            }
            return cantElementos;
        }
    }
}
