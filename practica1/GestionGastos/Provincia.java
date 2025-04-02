package GestionGastos;

public class Provincia {
    private String nombre;
    private Ciudad[] ciudades;
    private int cantCiudades;

    public Provincia(String nombre, Ciudad[] ciudades) {
        this.nombre = nombre;
        this.ciudades = ciudades;
        this.cantCiudades = ciudades.length;
    }
    
    public Ciudad[] getCiudades() {
        return ciudades;
    }

    public int getCantCiudades() {
        return cantCiudades;
    }

    public String getNombre() {
        return nombre;
    }

    public int contarCiudadesEnDeficit() {
        int contador = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.tieneDeficit()) {
                contador++;
            }
        }
        return contador;
    }
    
}
