package es.avalon.testing;

public class Motor {

    private int kilowatios;

    public int getKilowatios() {
        return kilowatios;
    }

    public void setKilowatios(int kilowatios) {
        this.kilowatios = kilowatios;
    }

    public double getPotencia(){
        return kilowatios*0.73;
    }
    public double gastoGasolina(){
        return getPotencia()*2;
    }

    public Motor(int kilowatios) {
        this.kilowatios = kilowatios;
    }
}
