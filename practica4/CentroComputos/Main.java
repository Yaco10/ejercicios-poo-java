package CentroComputos;
public class Main {
    public static void main(String[] args) {
        CentroDeComputos centro = new CentroDeComputos();

        // Crear computadoras
        Computadora comp1 = new Computadora(100);
        Computadora comp2 = new Computadora(200);
        Computadora comp3 = new Computadora(50);

        centro.agregarComputadora(comp1);
        centro.agregarComputadora(comp2);
        centro.agregarComputadora(comp3);

        // Crear procesos
        Proceso proc1 = new Proceso(100);
        Proceso proc2 = new Proceso(200);
        Proceso proc3 = new Proceso(50);

        centro.agregarProceso(proc1);
        centro.agregarProceso(proc2);
        centro.agregarProceso(proc3);

        // Ejecutar todos los procesos posibles
        centro.ejecutar();

        // Mostrar estado final de las computadoras
        System.out.println("Estado de computadoras después de la asignación:");
        System.out.println(comp1.toString());
        System.out.println(comp2.toString());
        System.out.println(comp3.toString());

        centro.finalizarProcesos();

        System.out.println("Estado de computadoras después de finalizar:");
        System.out.println(comp1.toString());
        System.out.println(comp2.toString());
        System.out.println(comp3.toString());
    }
}
