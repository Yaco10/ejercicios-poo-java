package Estructura.ConjuntoString;
import java.util.Random;

public class ConjuntoString {
    NodoString primero;

    public ConjuntoString(){
        this.primero = null;
    }

    public void almacenarString(String string){
        NodoString nuevo = new NodoString(string);
        if(primero == null){
            nuevo.setSiguiente(primero);
            primero = nuevo;
        }
        else {
            NodoString aux = primero; 
            while(aux.getSiguiente() != null){
                if(aux.getContenido().equals(string)){
                    System.out.println("No se pueden repetir elementos");
                    return;
                }
                aux = aux.getSiguiente();
            }
            if(aux.getContenido() != string){
                aux.setSiguiente(nuevo);
            }
            else{
            System.out.println("No se pueden repetir elementos");    
            }
                    
        
    }
  }

  public boolean contieneString(String string){
    if(primero == null){
        return false;
    }
    else{
        NodoString aux = primero;
        while(aux.getSiguiente() != null){
            if(aux.getContenido().equals(string)){
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
  }

  public int obtenerCantidad(){
    if(primero == null){
        return 0;
    }
    else{
        int cant = 0;
        NodoString aux = primero;
        while(aux.getSiguiente()!=null){
            cant++;
        }
        return cant;
    }
  }

  public void borrarElemento(){
    Random random = new Random();
    NodoString aux = primero;
    NodoString anterior = null;
    int tope = random.nextInt(obtenerCantidad());
    for(int i=0; i < tope; i++){
        anterior = aux;
        if(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
    }
    anterior.setSiguiente(aux.getSiguiente());

  }
}