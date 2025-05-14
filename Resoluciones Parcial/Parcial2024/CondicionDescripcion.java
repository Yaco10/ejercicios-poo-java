class CondicionDescripcion implements Condicion{
    private String palabra;
    public CondicionDescripcion(String palabra){
        this.palabra = palabra;
    }
    public boolean cumple(Articulo a){
        return a.getDescripcion().contains(palabra);
    }
}