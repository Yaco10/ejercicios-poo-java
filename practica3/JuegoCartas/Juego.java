import java.util.ArrayList;

class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Mazo mazo;
    private ArrayList<Carta> cartasJugada;

    private final static int cantCartasRonda = 4;

    public Juego(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.mazo = new Mazo(); 
        this.cartasJugada = new ArrayList<Carta>();
    }

    public void darCartas() {
        for (int i = 0; i < cantCartasRonda; i++) {
            cartasJugada.add(mazo.sacarCarta());
        }
    }

    public void jugada() {
        if(cartasJugada.get(0).getValor() > cartasJugada.get(1).getValor()) {
            ganaRonda(jugador1);
        }
        else if(cartasJugada.get(0).getValor() < cartasJugada.get(1).getValor()){
            ganaRonda(jugador2);
        }
        else if(cartasJugada.get(0).getValor() + cartasJugada.get(2).getValor() > cartasJugada.get(1).getValor() + cartasJugada.get(3).getValor()) {
            ganaRonda(jugador1);
        }
        else if(cartasJugada.get(0).getValor() + cartasJugada.get(2).getValor() < cartasJugada.get(1).getValor() + cartasJugada.get(3).getValor()){
            ganaRonda(jugador2);
        }
        else {
            empate();
        }
    }

    public void empate() {
        cartasJugada.add(mazo.sacarCarta());
        cartasJugada.add(mazo.sacarCarta());

        if(cartasJugada.get(4).getValor() > cartasJugada.get(5).getValor()) {
            ganaRonda(jugador1);
        }
        else if(cartasJugada.get(4).getValor() < cartasJugada.get(5).getValor()){
            ganaRonda(jugador2);
        }
    }

    public void ganaRonda(Jugador ganador) {
        for (Carta carta : cartasJugada) {
            ganador.agregarCarta(carta);
        }
        cartasJugada.clear();
    }
}

