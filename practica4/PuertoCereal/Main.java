import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();
        Barco barco1 = new Barco(100);
        Barco barco2 = new Barco(200);
        Camion camion1 = new Camion(LocalDate.now());
        Camion camion2 = new Camion(LocalDate.now().plusDays(1));
        
        puerto.agregarBarco(barco1);
        puerto.agregarBarco(barco2);
        puerto.agregarCamion(camion1);
        puerto.agregarCamion(camion2);
        
        puerto.cargarBarco();
        puerto.cargarBarco();
    }
}

