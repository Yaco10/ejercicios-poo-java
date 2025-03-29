package EstablecimientoDeportivo;

public class Cancha {
    String nombre;
    int precio;
    
    public Cancha(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }
}

class CanchaFutbol extends Cancha {
    private static final int CANCHA_FUTBOL = 400;

    public CanchaFutbol(String nombre) {
        super(nombre, CANCHA_FUTBOL);
    }

    public int getPrecio(Usuario usuario){
        if(usuario.isSocio()){
            return super.getPrecio() - 100;
        }
        return super.getPrecio();
    }
}

class CanchaPadel extends Cancha {
    private static final int CANCHA_PADEL = 100;

    public CanchaPadel(String nombre) {
        super(nombre, CANCHA_PADEL);
    }

    public int getPrecio(Usuario usuario){
        if(usuario.isSocio()){
            return super.getPrecio() - 50;
        }
        return super.getPrecio();
    }
}