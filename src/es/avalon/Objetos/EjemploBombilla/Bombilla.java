package es.avalon.Objetos.EjemploBombilla;

public class Bombilla {

    private Boolean encendida;
    private int id;



    public boolean isEncendida(){
        return encendida;
    }

    public void on(){
        encendida= true;
        System.out.println("bombilla encendida" + getId());
    }

    public void off(){
        encendida=false;
        System.out.println("bombilla apagada" + getId());
    }

    public int getId() {
        return id;
    }

    public Bombilla(int id){
        this.id=id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
