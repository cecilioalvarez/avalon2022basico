
package es.avalon.objeto.ejemplo13;

public class bombilla {
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

    public bombilla(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
