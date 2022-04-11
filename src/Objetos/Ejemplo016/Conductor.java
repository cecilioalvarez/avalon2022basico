package Objetos.Ejemplo016;

public class Conductor {
    private Coche c;

    public Conductor(Coche c) {
        this.c = c;
    }

    public Coche getC() {
        return c;
    }

    public void setC(Coche c) {
        this.c = c;
    }
    public void girar(){
        c.girar();
    }
    public void cambiar(){
        c.cambiarMarcha();
    }
}
