package es.avalon.objetos.ejemplo13;

public class Bombilla {

    private boolean encendida;
    private int id;

    public boolean estaEncendida() {
        return encendida;
    }
    public void on() {
        encendida=true;
    }
    public void off () {
        encendida=false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
