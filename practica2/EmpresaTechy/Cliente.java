public class Cliente extends Persona {
    private double totalCompras;

    public Cliente(String nombre, String apellido, int DNI, String mail) {
        super(nombre, apellido, DNI, mail);
        this.totalCompras = 0;
}
}