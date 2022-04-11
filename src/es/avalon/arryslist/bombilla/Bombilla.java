package es.avalon.arryslist.bombilla;

public class Bombilla {
    private boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void encenderBombilla(){
        estado = true;

    }
    public void apagarBombilla(){
        estado = false;
    }
}
