package es.avalon.objetos.ejemplo11Polimorfismo;

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

    public void girarCoche(){
        coche.girar();
    }

    public void cambiarMarcha(){
        coche.cambiarMarcha();
    }
}
