public class CajaAhorro extends Cuenta {
    public CajaAhorro(Cliente cliente) {
        super(cliente);
    }

    public boolean extraer(float monto) {   
        if(super.getSaldo() >= monto ){ 
            float montoDebitado = super.getSaldo() - monto;
            setSaldo(montoDebitado);
            return true;
        } 
        return false;
    }
}
