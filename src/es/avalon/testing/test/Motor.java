package es.avalon.testing.test;

public class Motor {
    private int kiloWatios;

    public int getKiloWatios() {
        return kiloWatios;
    }

    public void setKiloWatios(int kiloWatios) {
        this.kiloWatios = kiloWatios;
    }

    public double getPotencia(){
        return kiloWatios*0.73;
    }

    public double GastoGasolina(){
        return getPotencia()*2;
    }

    public Motor(int kiloWatios) {
        this.kiloWatios = kiloWatios;
    }
}
