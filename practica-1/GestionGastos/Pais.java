package GestionGastos;

public class Pais {
    private String pais;
    private Provincia[] provincias; 
    private int cantProvincias;

    public Pais(String pais, Provincia[] provincias) {
        this.pais = pais;
        this.provincias = provincias;
        this.cantProvincias = provincias.length;
    }

    public void ciudadesMasGasto(){
        for(Provincia provincia : provincias){
            for(Ciudad ciudad : provincia.getCiudades()){
                if(ciudad.tieneDeficit()){
                    System.out.println(ciudad.getNombre());
                }
            }
        }
    }

    public void provinciasMasGasto(){
        for(Provincia provincia : provincias){
            if(provincia.contarCiudadesEnDeficit() > (provincia.getCantCiudades() / 2) ){
                System.out.println("Provincia con mas gasto: " + provincia.getNombre());
            }
        }
    }
}
