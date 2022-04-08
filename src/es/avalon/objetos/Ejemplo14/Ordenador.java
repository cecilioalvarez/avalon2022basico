package es.avalon.objetos.Ejemplo14;

public class Ordenador {

    private Nas nas;

    public Ordenador() {
    }

    public void addDisco(DiscoDuro discoDuro) {
        nas.addDisco(discoDuro);
    }

    public double tamañoNas() {
        return nas.tamañoNas();
    }

    public Ordenador(Nas nas) {
        this.nas = nas;
    }

    public Nas getNas() {
        return nas;
    }

    public void setNas(Nas nas) {
        this.nas = nas;
    }



}
