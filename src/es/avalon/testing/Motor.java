package es.avalon.testing;
public class Motor {

    private int kiloWatios;

    public int getKiloWatios() {
        return kiloWatios;
    }

    public void setKiloWatios(int kiloWatios) {
        this.kiloWatios = kiloWatios;
    }

    // le acabo de implementar de forma incorrecta
    public double getPotencia() {

        return  kiloWatios*0.73;
    }

    public double gastoGasolina() {

        return getPotencia()* 2;
    }

    public Motor(int kiloWatios) {
        this.kiloWatios = kiloWatios;
    }

}
