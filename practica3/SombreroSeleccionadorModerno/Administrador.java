class Administrador {
    private List<Alumno> alumnos;
    private List<Casa> casas;
    public Administrador() {
        this.alumnos = new ArrayList<>(); 
        this.casas = new ArrayList<>(); 
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void agregarCasa(Casa casa) {
        this.casas.add(casa);
    }

    public void asignarCasa(Alumno alumno, Casa casa) {
        if (casa.alumnoAceptado(alumno) && casa.espacioDisponible()) {
            alumno.setCasa(casa);
            casa.agr4egarAlumno(alumno);
        }
    } 
}