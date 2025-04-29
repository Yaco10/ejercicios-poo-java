class Jugador {
    private String nombre;
    private Mazo mazo;
    
    public Jugador (String nombre) {
        this.nombre = nombre;
        this.mazo = new Mazo();
    }

    public void agregarCarta(Carta carta){
        this.mazo.agregarCarta(carta);
    }
}