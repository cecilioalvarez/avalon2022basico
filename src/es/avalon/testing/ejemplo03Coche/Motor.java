package es.avalon.testing.ejemplo03Coche;

public class Motor {

    private int kiloWatios;

    public int getKiloWatios() {
        return kiloWatios;
    }

    public void setKiloWatios(int kiloWatios) {
        this.kiloWatios = kiloWatios;
    }

    public double getPotencia() {
        return kiloWatios*0.73;
    }

    public double gastoGasolina() {
        return getPotencia() * 2;
    }

    public Motor(int kiloWatios) {
        this.kiloWatios = kiloWatios;
    }

}
