public class EmpleadoPlusVentas extends Empleado{
    private int ventasRealizadas;
    private int porcentajeComision;
    public EmpleadoPlusVentas(String nombre, float salario, int ventasRealizadas, int porcentajeComision) {
        super(nombre,salario);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + (ventasRealizadas * porcentajeComision) / 100;
    }
}
