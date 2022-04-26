package es.avalon.Testing;

public class Motor {
    private int kilowatios;

    public Motor(int kilowatios) {
        this.kilowatios = kilowatios;
    }

    public double getPotencia(){
        return kilowatios*0.73;
    }

    public int getKilowatios() {
        return kilowatios;
    }

    public void setKilowatios(int kilowatios) {
        this.kilowatios = kilowatios;
    }
}
