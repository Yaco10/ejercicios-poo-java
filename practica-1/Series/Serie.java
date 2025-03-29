package Series;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private int cantTemporadas;
    private Temporada[] temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero, Temporada[] temporadas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = temporadas;
        this.cantTemporadas = temporadas.length;
    }

    public int getEpisodiosVistos() {
        int episodiosVistos = 0;
        for (Temporada temporada : temporadas) {
            int episodiosVistosTemporada = temporada.getEpisodiosVistos();
                episodiosVistos += episodiosVistosTemporada;
            }
            return episodiosVistos;
        }
    
        public double promedioCalificacionesSerie(){
            double sumaCalificaciones = 0;
            int totalEpisodiosVistos = 0;
            
            for (Temporada temporada : temporadas) {
                for (Episodio episodio : temporada.getEpisodios()) {
                    if (episodio.getVisto()) {
                        sumaCalificaciones += episodio.getCalificacion();
                        totalEpisodiosVistos++;
                    }
                }
            }
            
            return (totalEpisodiosVistos > 0) ? sumaCalificaciones / totalEpisodiosVistos : 0.0;
        }

        public boolean vioTodaLaSerie() {
            for (Temporada temporada : temporadas) {
                for (Episodio episodio : temporada.getEpisodios()) {
                    if (!episodio.getVisto()) {
                        return false;
                    }
                }
            }
            return true;
        }        
        
}

