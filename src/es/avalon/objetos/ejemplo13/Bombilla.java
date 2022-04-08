package es.avalon.objetos.ejemplo13;

public class Bombilla {
    private boolean encendida;
private int id;
    public boolean estaEncendida() {
        return encendida;
    }

    public  void on(){
        encendida=true;
        System.out.println("encendida"+ getId());
    }
    public void off(){
        encendida=false;
        System.out.println("apagada"+getId());
    }
    public Bombilla(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

