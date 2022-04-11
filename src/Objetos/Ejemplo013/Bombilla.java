package Objetos.Ejemplo013;

public class Bombilla {
    private boolean estado;

    public void on(){
        estado = true;
    }
    public void off(){
        estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
