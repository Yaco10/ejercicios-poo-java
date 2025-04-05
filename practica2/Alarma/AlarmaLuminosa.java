public class AlarmaLuminosa extends Alarma{
    Luz luz;
    public AlarmaLuminosa() {
        super();
        this.luz = new Luz();
    }

    @Override
    public void activarAlarma() {
        if(super.comprobar()){
            super.getTimbre().hacerSonar();
            luz.encender();
        }
    }
}
