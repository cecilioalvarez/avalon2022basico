package es.avalon.objetos.ejemplo13;

public class Bombilla {

    private boolean encendida;
    private int id;

    public boolean isEncendida() {
        return encendida;
    }

    public void on(){
        encendida=true;
        System.out.println("bombilla encendida"+getId());
    }
    public void off(){
        encendida=false;
        System.out.println("bombilla apagada"+getId());
    }

    public Bombilla(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
