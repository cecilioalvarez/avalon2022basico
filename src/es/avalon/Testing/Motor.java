package es.avalon.Testing;

public class Motor {

    private int kiloWatios;

    public int getKiloWatios() {
        return kiloWatios;
    }

    public void setKiloWatios(int kiloWatios) {
        this.kiloWatios = kiloWatios;
    }

    public double getPotencia() {

        return  kiloWatios*0.73;
    }

    public double gastoGasolina(){

        return getPotencia()*1.80;
    }

    public Motor(int kiloWatios) {
        this.kiloWatios = kiloWatios;
    }
}
