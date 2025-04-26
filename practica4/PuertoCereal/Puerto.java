import java.util.PriorityQueue;

public class Puerto {
    private PriorityQueue<Camion> camiones; 
    private PriorityQueue<Barco> barcos;

    public Puerto(){
        this.camiones = new PriorityQueue<>();
        this.barcos = new PriorityQueue<>();
    }

    public void agregarBarco(Barco barco){
        this.barcos.add(barco);
        System.out.println("Se agrego un barco al puerto");
    }

    public void agregarCamion(Camion camion){
        this.camiones.add(camion);
        System.out.println("Se agrego un camion al puerto");
    }

    public void cargarBarco(){
        if(!this.camiones.isEmpty() && !this.barcos.isEmpty()){
            Barco barcoPrioritario = this.barcos.poll();
            Camion camionPrioritario = this.camiones.poll();
            if(camionPrioritario.isConCarga()){
                System.out.println("Se va a cargar el barco");
                barcoPrioritario.cargarBarco();
                System.out.println("El barco esta cargado");
                camionPrioritario.desCargar();
                System.out.println("El camion esta descargado");
            }else{
                System.out.println("El camion no tiene carga");
            }
        }else{
            System.out.println("No hay barcos o camiones para cargar");
        }
    }
}

