package EstablecimientoDeportivo;

public class CanchaFutbol extends Cancha {
    private static final int CANCHA_FUTBOL = 400;

    public CanchaFutbol(String nombre) {
        super(nombre, CANCHA_FUTBOL); // El precio es fijo y no puede modificarse
    }

    public int getPrecio(Usuario usuario){
        if(usuario.isSocio()){
            return super.getPrecio() - 100;  // Aplicar descuento para socios
        }
        return super.getPrecio();
    }
}
