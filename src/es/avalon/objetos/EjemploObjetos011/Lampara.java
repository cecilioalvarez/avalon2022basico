package es.avalon.objetos.EjemploObjetos011;

public class Lampara {

    private Bombilla bombilla;

    public Bombilla getBombilla() {
        return bombilla;
    }

    public void setBombilla(Bombilla bombilla) {
        this.bombilla = bombilla;
    }

    public void on() {
        bombilla.on();
    }

    public void off() {
        bombilla.off();
    }

    public Lampara(Bombilla bombilla) {
        this.bombilla = bombilla;
    }
}
