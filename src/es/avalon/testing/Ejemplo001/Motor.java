package es.avalon.testing.Ejemplo001;

public class Motor {


    private int kW;
    //private int cilindros;

    public Motor(int kW) {
        this.kW = kW;
    }

    public int getkW() {
        return kW;
    }

    public void setkW(int kW) {
        this.kW = kW;
    }

    public double getPotencia(){

        return kW*0.73*2;
    }

}
