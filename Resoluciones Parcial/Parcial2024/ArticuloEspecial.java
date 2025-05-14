public class ArticuloEspecial extends Articulo{
    private int unidadesConocidas;
    private Condicion control; 
    private double otroPrecio;

    public ArticuloEspecial(String nombre ,String descripcion, double precio, int peso, int unidadesConocidas, Condicion control, double otroPrecio) {
        super(nombre, descripcion, precio, peso);
        this.unidadesConocidas = unidadesConocidas;
        this.control = control;
        this.otroPrecio = otroPrecio;
    }

    public double getPrecio(){
        if(control.cumple(this)){
            return otroPrecio;
        }else{
            return super.getPrecio();
        }
    }
}
