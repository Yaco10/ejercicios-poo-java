package practica3.ConversorMedidas;

public class ConversorMedidas {
    private static final double CENTIMETROS_PULGADA = 2.54;
    private static final double LIBRA_KILO = 0.453592;
    private static final double GALON_LITRO = 3.78541;

    public static double convertirPulgadasEnCentimetros(double pulgadas) {
        return pulgadas * CENTIMETROS_PULGADA;
    }

    public static double convertirCentimetrosEnPulgadas(double centimetros) {
        return centimetros / CENTIMETROS_PULGADA;
    }

    public static double convertirLibrasEnKilos(double libras) {
        return libras * LIBRA_KILO;
    }

    public static double convetirKilosEnLibras(double kilos) {
        return kilos / LIBRA_KILO;
    }

    public static double convertirGalonEnLitros(double galones) {
        return galones * GALON_LITRO;
    }

    public static double convertirLitrosEnGalon(double litros) {
        return litros / GALON_LITRO;
    }   
}   
