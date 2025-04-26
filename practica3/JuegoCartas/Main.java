public class Main {
    public static void main(String[] args) {
        // Crear los jugadores
        Jugador jugador1 = new Jugador("Jugador 1");
        Jugador jugador2 = new Jugador("Jugador 2");

        // Crear el mazo y agregar cartas
        Mazo mazo = new Mazo();
        mazo.agregarCarta(new Carta(5,"basto"));
        mazo.agregarCarta(new Carta(4,"basto"));
        mazo.agregarCarta(new Carta(7,"basto"));
        mazo.agregarCarta(new Carta(8,"basto"));
        mazo.agregarCarta(new Carta(10,"basto"));
        mazo.agregarCarta(new Carta(5,"basto"));

        // Crear el juego
        Juego juego = new Juego(jugador1, jugador2, mazo);

        // Llenar el mazo de jugadores
        // (esto es solo para simular que se reparten cartas a los jugadores)

        // Imprimir los mazos de los jugadores antes del juego
        System.out.println("Cartas Jugador 1: " + jugador1.getCantCartas());
        System.out.println("Cartas Jugador 2: " + jugador2.getCantCartas());

        // Jugar
        juego.jugar();

        // Imprimir las cartas de los jugadores después del juego
        System.out.println("Cartas Jugador 1 después del juego: " + jugador1.getCantCartas());
        System.out.println("Cartas Jugador 2 después del juego: " + jugador2.getCantCartas());
    }
}
