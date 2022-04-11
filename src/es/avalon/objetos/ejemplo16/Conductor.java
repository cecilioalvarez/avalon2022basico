package es.avalon.objetos.ejemplo16;

public class Conductor {
    private Coche coche;

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Conductor(Coche coche) {
        this.coche = coche;
    }
    public void cambiarMarcha(){
        coche.cambiarMarcha();
    }
    public void girarCoche(){
        coche.girar();
    }
}
