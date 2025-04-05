public class EmpleadoPlusHora extends Empleado {
    private int horasExtra;
    private float extraPorHora;

    public EmpleadoPlusHora(String nombre, float salario, int horasExtra,float extraPorHora) {
        super(nombre,salario);
        this.horasExtra = horasExtra;
        this.extraPorHora = extraPorHora;
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + horasExtra*extraPorHora;
    }
    
}
