import java.util.ArrayList;
import java.util.List;

class SistemaPagos {
    private List<Empleado> empleados;

    public SistemaPagos() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, float salario) {
        Empleado empleado = new Empleado(nombre, salario);
        empleados.add(empleado);
    }

    public void agregarEmpleadoHora(String nombre, float salario, int horasExtra, float extraPorHora) {
        Empleado empleado = new EmpleadoPlusHora(nombre, salario, horasExtra, extraPorHora);
        empleados.add(empleado);
    }

    public void agregarEmpleadoVentas(String nombre, float salario, int ventasRealizadas, int porcentajeComision) {
        Empleado empleado = new EmpleadoPlusVentas(nombre, salario, ventasRealizadas, porcentajeComision);
        empleados.add(empleado);
    }

    public void calcularPagos() {
        for (Empleado empleado : empleados) {
            System.out.println("Pago de " + empleado.getNombre() + ": $" + empleado.calcularSalario());
        }
    }

    public float pagoAUnEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado.calcularSalario();
            }
        }
        return 0;
    }
    
}