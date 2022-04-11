package es.avalon.objeto.ejemplo16;

public class Coductor {
    private Coche coche;

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Coductor(Coche coche) {
        this.coche = coche;
    }
    public void girarCoche() {
        coche.girar();
    }

    public  void cambiarMarcha() {

        coche.cambiarMarcha();
    }

}
