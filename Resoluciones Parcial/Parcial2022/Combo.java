import java.util.ArrayList;
import java.util.List;

public class Combo extends ElementoAlquilable {
    private List<ElementoAlquilable> combos;

    public Combo(int codigoIdentificacion){
        super(codigoIdentificacion);
        this.combos = new ArrayList<>();
    }

    @Override
    public double getPrecio(){
        double precio = 0;
        for(ElementoAlquilable c : combos){
            precio += c.getPrecio();
        }
        return precio;
    }

    @Override
    public double getValorAlquiler(){
        double valorAlquiler = 0;
        for(ElementoAlquilable c : combos){
            valorAlquiler += c.getValorAlquiler();
        }
        return valorAlquiler;
    }

    @Override
    public ElementoAlquilable getCopia(Condicion c1){
        Combo copia = new Combo(super.getCodigoIdentificacion());
        boolean seCopio = false;
        for(ElementoAlquilable e : combos){
            ElementoAlquilable copiaElemento = getCopia(c1);
            if(copiaElemento != null){
                copia.addElemento(copiaElemento);
                seCopio = true;
            }
        }
        if(seCopio){
            return copia;
        }
        else{
            return null;
        }
    }   

    @Override
    public int getAntiguedad(){
        int antiguedadMax = 0;
        int antiguedadActual = 0;
        for(ElementoAlquilable e : combos){
            antiguedadActual = e.getAntiguedad();
            if(antiguedadActual > antiguedadMax){
                antiguedadMax = antiguedadActual;
            }
        }
        return antiguedadMax;
    }

    public void addElemento(ElementoAlquilable elemento){
        this.combos.add(elemento);
    }
}
