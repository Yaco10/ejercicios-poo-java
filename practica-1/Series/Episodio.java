package Series;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    // Valores por defecto
    private static final int CALIFICACION_DEFECTO = -1;

    public Episodio(String titulo, String descripcion, boolean visto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.calificacion = CALIFICACION_DEFECTO;
    }


    public Episodio(String titulo, String descripcion, boolean visto, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        if(calificacion >= 1 && calificacion <= 5){
            this.calificacion = calificacion;
        }
        else{
            System.out.println("La calificacion debe estar entre 1 y 5");
        }
    }

    public boolean getVisto(){
        return visto;
    }

    public int getCalificacion(){
        return calificacion;
    }       
        
    public void calificarEpisodio(int calificacion) {
        if (calificacion >= 1 && calificacion <= 5) {
            this.calificacion = calificacion;
        } else {
            System.out.println("La calificacion debe estar entre 1 y 5");
        }
    }

    
    

}
