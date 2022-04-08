package es.avalon.objetos.ejemplo13;

public class Bombilla {
    private boolean encendida;
    private int id;

    public Bombilla(int id) {
        this.id = id;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void on(){
        encendida= true;
        System.out.println("La bombilla esta Encendida" + getId());
    }
    public void off(){
        encendida= false;
        System.out.println("La bombilla esta Apagada" + getId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
