package es.avalon.objetos.EjemploObjetos011;

public class Bombilla {

    private boolean encendida;
    private int id;

    public boolean estaEncendida() {
        return encendida;
    }
    public void on() {
        encendida=true;
        System.out.println(" bombilla encendida: " + getId());
    }
    public void off () {
        encendida=false;
        System.out.println(" bombilla apagada" + getId());
    }

    //Constructor
    public Bombilla(int id) {
        this.id = id;
    }

    //Getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
