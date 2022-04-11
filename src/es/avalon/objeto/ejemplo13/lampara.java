
package es.avalon.objeto.ejemplo13;

public class lampara {

    private bombilla bombilla;

    public bombilla getBombilla() {
        return bombilla;
    }

    public void setBombilla(bombilla bombilla) {
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

    public lampara(bombilla bombilla) {
        this.bombilla = bombilla;
    }




}
