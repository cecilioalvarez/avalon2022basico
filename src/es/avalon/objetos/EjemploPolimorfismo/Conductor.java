package es.avalon.objetos.EjemploPolimorfismo;

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

    public void girarCoche() {
        coche.girar();
    }


    public  void cambiarMarcha() {

        coche.cambiarMarcha();
    }
}
