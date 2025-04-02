package Electrodomesticos;
public class Electrodomestico {
    // Atributos
    private String nombre;
    private double precioBase;
    private String color;
    private double consumoEnergetico;
    private double peso;

    // Valores por defecto
    private static final String COLOR_DEFECTO = "Gris Plata";
    private static final double CONSUMO_DEFECTO = 10.0;
    private static final double PRECIO_DEFECTO = 100.0;
    private static final double PESO_DEFECTO = 2.0;

    // Constructor por defecto
    public Electrodomestico() {
        this.nombre = "Desconocido";
        this.precioBase = PRECIO_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }

    // Constructor con nombre y precio
    public Electrodomestico(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }

    // Constructor con todos los atributos
    public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para mostrar la información del electrodoméstico
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio Base: " + precioBase + " pesos");
        System.out.println("Color: " + color);
        System.out.println("Consumo Energético: " + consumoEnergetico + " Kw");
        System.out.println("Peso: " + peso + " kg");
    }

    // Funciones
    public void comprobarConsumoEnergetico() {
        if (consumoEnergetico < CONSUMO_DEFECTO) {
            System.out.println("Es de bajo consumo");
        } else {
            System.out.println("Es de alto consumo");
        }    
    }

    public double calcularBalance(){
        double balance = precioBase / peso;
        return balance;
    }

    public void esAltaGama(){
        if(calcularBalance() > 3){
            System.out.println("Es alta gama");
        } else {
            System.out.println("No es alta gama");
        }
    }
}

