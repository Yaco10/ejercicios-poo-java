class Empleado {
    private String nombre;
    private float salario;

    public Empleado(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public float calcularSalario(){
        return salario;
    }
}