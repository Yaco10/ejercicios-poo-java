package Series;

public class Temporada {
    private int cantEpisodios;
    private Episodio[] episodios;

    public Temporada(Episodio[] episodios) {
        this.episodios = episodios;
        this.cantEpisodios = episodios.length;
    }

    public Episodio[] getEpisodios() {
        return this.episodios;
    }

    public int getEpisodiosVistos() {
        int episodiosVistos = 0;
        for (Episodio episodio : episodios) {
            if (episodio.getVisto()) {
                episodiosVistos++;
            }
        }
        return episodiosVistos;
    }

    public double promedioCalificaciones() {
        int totalCalificaciones = 0;
        int sumaCalificaciones = 0;
        for (Episodio episodio : episodios) {
            if (episodio.getCalificacion() != -1) {
                totalCalificaciones++;
                sumaCalificaciones += episodio.getCalificacion();
            }
        }
        return (totalCalificaciones > 0) ? (double) sumaCalificaciones / totalCalificaciones : 0.0;

    }
}
