package SistemaBancario;
import java.util.*;

public class Cliente {
    private String nombre;
    private List<Cuenta> cuentas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }
}
