package GestionGastos;

public class Ciudad {
    private String nombre;
    private int imp1, imp2, imp3, imp4, imp5, gasto;

    public Ciudad(String nombre, int imp1, int imp2, int imp3, int imp4, int imp5, int gasto) {
        this.nombre = nombre;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.gasto = gasto;
    }

    public String getNombre() {
        return nombre;
    }

    private int getGasto(){
        return gasto;
    }

    private int getImpuestos(){
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public boolean tieneDeficit() {
        if (getGasto() > getImpuestos()) {
            return true;
        }
        return false;
    }

}
