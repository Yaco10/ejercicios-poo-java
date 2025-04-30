public class CondicionPalabra implements Filtrador {
    String palabraFiltro;

    public CondicionPalabra(String palabraFiltro) {
        this.palabraFiltro = palabraFiltro;
    }

    @Override
    public boolean cumpleCon(Noticia n) {
        return n.contienePalabra(palabraFiltro);
    }
}

