package EstablecimientoDeportivo;

public class CanchaPadel extends Cancha {
    private static final int CANCHA_PADEL = 100;

    public CanchaPadel(String nombre) {
        super(nombre, CANCHA_PADEL);  // El precio es fijo y no puede modificarse
    }

    public int getPrecio(Usuario usuario){
        if(usuario.isSocio()){
            return super.getPrecio() - 50;  // Aplicar descuento para socios
        }
        return super.getPrecio();
    }
}