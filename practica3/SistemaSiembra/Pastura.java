

public class Pastura extends Cereal{
    private int cantHectareasMinima;

    public Pastura(String nombre, int cantHectareas) {
        super(nombre);
        this.cantHectareasMinima = cantHectareas;
    }

    @Override
    public boolean compatibleConTerreno(Lote lote) {
       if(lote.getCantHectareas() >= cantHectareasMinima){
           return super.compatibleConTerreno(lote);
       }
       else{
        return false;
       }
       
     }
}
