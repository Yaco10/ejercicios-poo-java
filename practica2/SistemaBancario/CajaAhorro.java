public class CajaAhorro {
    public CajaAhorro(Cliente cliente) {
        super(cliente);
    }

    public boolean extraer(float monto) {   
        if(monto >= this.saldo){ saldo-= monto } return true;
        return false;
    }
}
