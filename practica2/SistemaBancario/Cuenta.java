abstract class Cuenta {
    private float saldo;
    private Cliente cliente;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
    }

    public void depositar(float monto) {
        this.saldo += monto;
    }

    abstract boolean retirar(float monto);

    public float getSaldo() {
        return this.saldo;
    }

}
