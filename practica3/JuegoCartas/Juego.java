import java.util.ArrayList;

class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Mazo mazo;
    private ArrayList<Carta> cartasJugada;
    public boolean enJuego;

    private final static int cantCartasRonda = 4;

    public Juego(Jugador jugador1, Jugador jugador2, Mazo mazo) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.mazo = mazo;
        this.cartasJugada = new ArrayList<Carta>();
        this.enJuego = true;
    }

    public void jugar() {
        mazo.mezclar();
        while (enJuego) {
            darCartas();
            jugada();
            verificarVictoria();
        }
    }

    public void verificarVictoria() {
        if (mazo.cantCartas() == 0) {
            if (jugador1.getCantCartas() > jugador2.getCantCartas()) {
                System.out.println("Gano Jugador 1");
            } else if (jugador1.getCantCartas() < jugador2.getCantCartas()) {
                System.out.println("Gano Jugador 2");
            }
            enJuego = false;
        }
    }

    public void darCartas() {
        while (mazo.cantCartas() > 0 && cartasJugada.size() < cantCartasRonda) {
            cartasJugada.add(mazo.sacarCarta());
        }
    }

    public void jugada() {
        if (cartasJugada.size() >= 2 && cartasJugada.get(0).getValor() > cartasJugada.get(1).getValor()) {
            ganaRonda(jugador1);
        } else if (cartasJugada.size() >= 2 && cartasJugada.get(0).getValor() < cartasJugada.get(1).getValor()) {
            ganaRonda(jugador2);
        } else if (cartasJugada.size() >= 4 && cartasJugada.get(0).getValor()
                + cartasJugada.get(2).getValor() > cartasJugada.get(1).getValor() + cartasJugada.get(3).getValor()) {
            ganaRonda(jugador1);
        } else if (cartasJugada.size() >= 4 && cartasJugada.get(0).getValor()
                + cartasJugada.get(2).getValor() < cartasJugada.get(1).getValor() + cartasJugada.get(3).getValor()) {
            ganaRonda(jugador2);
        } else {
            empate();
        }
    }

    public void empate() {
        if (mazo.cantCartas() >= 2 && cartasJugada.size() >= 4) {
            cartasJugada.add(mazo.sacarCarta());
            cartasJugada.add(mazo.sacarCarta());

            if (cartasJugada.get(4).getValor() > cartasJugada.get(5).getValor()) {
                ganaRonda(jugador1);
            } else if (cartasJugada.get(4).getValor() < cartasJugada.get(5).getValor()) {
                ganaRonda(jugador2);
            }
        }

    }

    public void ganaRonda(Jugador ganador) {
        for (Carta carta : cartasJugada) {
            ganador.agregarCarta(carta);
        }
        cartasJugada.clear();
    }
}
