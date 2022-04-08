package es.avalon.objetos.ejercicio04Bombilla;

public class Bombilla {

    private boolean encendida;
    private int id;

    public Bombilla(int id) {
        this.id = id;
    }

    public Bombilla(boolean encendida, int id) {
        this.encendida = encendida;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void on(){
        encendida = true;
        System.out.println("Bombilla encendida, id: " + getId());
    }

    public void off(){
        encendida = false;
        System.out.println("Bombilla apagada, id: " + getId());
    }

    public Bombilla(boolean encendida) {
        this.encendida = encendida;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
}
