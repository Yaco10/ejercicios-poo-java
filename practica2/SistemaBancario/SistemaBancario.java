import java.util.List;
import java.util.ArrayList;

public class SistemaBancario {
    List<Cliente> clientes;

    public SistemaBancario() {
        this.clientes = new ArrayList<>();
    }

    public void crearCuentaCorriente(double descubierto, String nombre) {
        Cliente clienteEncontrado = buscarCliente(nombre);
        if(clienteEncontrado == null) {
            clienteEncontrado = new Cliente(nombre);
            clientes.add(clienteEncontrado);
            System.out.println("Se creo un nuevo Cliente");
        }
        Cuenta cuenta = new CuentaCorriente(clienteEncontrado, descubierto);
        clienteEncontrado.agregarCuenta(cuenta);
    }

    public void crearCajaAhorro(String nombre) {
        Cliente clienteEncontrado = buscarCliente(nombre);
        if(clienteEncontrado == null) {
            clienteEncontrado = new Cliente(nombre);
            clientes.add(clienteEncontrado);
            System.out.println("Se creo un nuevo Cliente");
        }
        Cuenta cuenta = new CajaAhorro(clienteEncontrado);
        clienteEncontrado.agregarCuenta(cuenta);
    }

    public void borrarCuenta(String nombre, int index) {
        Cliente clienteEncontrado = buscarCliente(nombre);
        if(clienteEncontrado != null) {
            clienteEncontrado.borrarCuenta(index);
        }
        else {
            System.out.println("No se encontro el cliente.");
        }
    }

    public void imprimirCuentas(String nombre) {
        Cliente clienteEncontrado = buscarCliente(nombre);
        if(clienteEncontrado != null) {
            clienteEncontrado.imprimirCuentas();
        }
        else {
            System.out.println("No se encontro el cliente.");
        }
    }

    public void mostrarSaldo(String nombre, int index) {        
        Cliente clienteEncontrado = buscarCliente(nombre);
        if(clienteEncontrado != null) {
            System.out.println(clienteEncontrado.getCuenta(index).getSaldo());
        }
        else {
            System.out.println("No se encontro el cliente.");
        }
    }

    public void depositarEnCuenta(String nombre, int index, float monto) {
        Cliente clienteEncontrado = buscarCliente(nombre);
        if(clienteEncontrado != null) {
            clienteEncontrado.depositarEnCuenta(index, monto);
        }
        else {
            System.out.println("No se encontro el cliente.");
        }
    }

    public void retirarDeCuenta(String nombre, int index, float monto) {
        Cliente clienteEncontrado = buscarCliente(nombre);
        if(clienteEncontrado != null) {
            clienteEncontrado.retirarCuenta(index, monto);
        }
        else {
            System.out.println("No se encontro el cliente.");
        }
    }

    private Cliente buscarCliente(String nombre) {
        for(Cliente cliente : this.clientes) {
            if(cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }
    
    
}