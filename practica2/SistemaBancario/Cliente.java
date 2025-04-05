import java.util.*;

public class Cliente {
    private String nombre;
    private List<Cuenta> cuentas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }

    public void borrarCuenta(int index) {
        this.cuentas.remove(index);
    }

    public Cuenta getCuenta(int index) {
        return this.cuentas.get(index);
    }

    public void depositarEnCuenta(int index, float monto) {
        this.cuentas.get(index).depositar(monto);

    }

    public void retirarCuenta(int index, float monto) {
        this.cuentas.get(index).extraer(monto);
    }

    public void imprimirCuentas() {
        int indice = 0;
        for(Cuenta cuenta : this.cuentas) {
            System.out.println(indice + " - " + cuenta.getSaldo());
            indice++;
        }
    }

}
