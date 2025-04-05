public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(Cliente cliente, double descubierto) {    
        super(cliente);
        this.descubierto = descubierto;
    }

    @Override
    public boolean extraer(float monto) {
        if(super.getSaldo() - monto > descubierto){ 
            float montoDebitado = super.getSaldo() - monto;
            setSaldo(montoDebitado);
            return true;
        } 
        return false;
    }
}
