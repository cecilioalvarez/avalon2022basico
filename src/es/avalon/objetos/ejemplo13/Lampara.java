package es.avalon.objetos.ejemplo13;

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
        System.out.println();
    }

    public void off() {
        bombilla.off();
        System.out.println();
    }

    public Lampara(Bombilla bombilla) {
        this.bombilla = bombilla;
    }
}
