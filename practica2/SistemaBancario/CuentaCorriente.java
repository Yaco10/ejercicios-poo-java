public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(Cliente cliente, double descubierto) {    
        super(cliente);
        this.descubierto;
    }

    @Override
    public boolean extraer(float monto) {
        if(saldo - monto > descubierto){ this.saldo -= monto; } return true;
        return false;
        
    }
}
