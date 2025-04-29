class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<Carta>();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void mezclar() {
        Collections.shuffle(cartas);
    }

   public Carta sacarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(cartas.size() - 1);
        } else {
            return null;
        }
    }
    public int cantCartas(){
      return  cartas.size();
    }
}