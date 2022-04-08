package es.avalon.objetos.Ejemplo13;

public class Bombilla {
    private boolean encendida;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void encender(){
      encendida=true;
    }
    public void apagar(){
        encendida=false;
    }


}
