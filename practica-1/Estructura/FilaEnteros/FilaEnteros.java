package Estructura.FilaEnteros;

public class FilaEnteros {
    NodoFila primero;

    public FilaEnteros (){
        this.primero = null;
    }

    public void insertarElemento(int numero){
        NodoFila nuevo = new NodoFila(numero);
        nuevo.setSiguiente(primero);
        primero = nuevo;
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
            NodoFila aux = primero;
            while (aux != null) {
                cantElementos++;
            }
            return cantElementos;
        }
    }
    
}
