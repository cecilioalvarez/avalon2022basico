package Test.Motor;

public class Motor {
    private double kiloWatios;


    public double getKiloWatios() {
        return kiloWatios;
    }

    public Motor(double kiloWatios) {
        this.kiloWatios = kiloWatios;
    }

    public void setKiloWatios(int kiloWatios) {
        this.kiloWatios = kiloWatios;
    }

    public double getPotencia(){
        return kiloWatios*0.73;
    }
    public double getConsumoGasolina(){
        return getPotencia()*1.80;
    }
}
